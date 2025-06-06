<?php

declare(strict_types=1);

/**
 * Class implementing logic for [IDENTIFYING INFORMATION REMOVED] - to run:
 * > php MagicTree.php
 * [number of trees]
 * [space separated ages]
 */
class MagicTree {
  /*
   * Validate constants
   */
  private const MAX_TREE_AGE = 7;
  private const MAX_TREES = 20;

  /**
   * Initialize a MagicTree for the parameters specified
   */
  public function __construct(
    private readonly int $n,
    private readonly int ...$ages
  ) {
    $err = null;
    // Number of ages must match number of trees
    if ($n !== count($ages)) {
      $err = sprintf(
        'ERROR: The number of ages [%d] must match the number of trees [%d]',
        count($ages),
        $n
      );
    // Validate trees
    } else if ($n < 1 || $n > self::MAX_TREES) {
      $err = sprintf(
        'Number of trees [%d] is not between [1-%d]',
        $n,
        self::MAX_TREES
      );
    // Validate ages
    } else {
      foreach ($ages as $age) {
        if ($age < 0 || $age > self::MAX_TREE_AGE) {
          $err = sprintf(
            'The age [%d] is not between [0-%d]',
            $age,
            self::MAX_TREE_AGE
          );
        }
      }
    }
    // Exit for any validation errors
    if ($err) {
      printf("%s\n", $err);
      exit(1);
    }
  }
}

$n = trim(fgets(STDIN));
$ages = explode(' ', trim(fgets(STDIN)));
new MagicTree((int) $n, ...array_map(fn($v) => (int)$v, $ages));

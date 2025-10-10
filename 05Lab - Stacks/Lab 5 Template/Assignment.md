
# Lab: Stacks Only (Java)

> Reference concepts: Stack ADT (LIFO), push/pop/peek, saving & restoring stacks, classic uses like delimiter matching and postfix evaluation. This lab intentionally **excludes queues**.

## Part A — Stack Warmup (2 pts)
Implement small helpers in `StackWarmup`:
- `reverseDigits(int n)`: Uses a stack to reverse the digits of `n` (e.g., `12340 -> 4321`).
- `fromArray(int[] a)`: Push array elements onto a stack so the last array element is on top.

## Part B — Balanced Brackets (3 pts)
In `BalancedBrackets`, implement `isBalanced(String s)` to return `true` if the string’s `()[]{}` delimiters are properly nested and matched.
- Ignore non-bracket characters.
- Example: `"{[()]}()[]" -> true`, `"{[(])}" -> false`.

## Part C — Postfix Evaluator (3 pts)
In `PostfixEvaluator`, implement `evaluate(String expr)` for integer postfix with operators `+ - * /`.
- Tokens are separated by whitespace, e.g., `"5 2 4 * + 7 -"` -> `6`.
- Use a stack of `Integer`.
- On invalid expressions, throw `IllegalArgumentException` with a clear message.

## Part D — Preserve the Stack (2 pts)
In `StackAlgorithms`, implement:
- `maxPreserving(Stack<Integer> s)`: returns the max integer **and** restores `s` to its original state.
  - You may use one auxiliary `Stack<Integer>` to save/restore.

## Runtime (discussion, ungraded)
In comments above each method, briefly note the dominant runtime in terms of `N` (stack size or input length).

## Submission
Submit all `.java` files with your completed TODOs. You may keep or remove `Driver`.

## 10-Point Grading Rubric
- **Correctness — Warmup (2 pts):** `reverseDigits`, `fromArray` pass basic tests, follow stack usage rules.
- **Correctness — Balanced (3 pts):** Handles nested/mixed delimiters; rejects mismatches and early closing.
- **Correctness — Postfix (3 pts):** Computes correct result; validates errors; uses stack properly.
- **Correctness — Preserve (2 pts):** Returns max and restores original stack order/state.

> Minor style deductions (up to −1 total, not below 0): Clear TODO markers removed only after completion, meaningful variable names, brief runtime comments, no unused code, no queue usage.

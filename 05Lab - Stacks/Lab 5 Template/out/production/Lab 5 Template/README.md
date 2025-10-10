
# CS Undergrad Lab — Stacks (Java)

This lab focuses **only on Stacks** (LIFO). You will implement stack-based utilities and algorithms using `java.util.Stack`.

## Learning goals
- Understand the Stack ADT (push, pop, peek, isEmpty, size).
- Apply stacks to real problems (balanced delimiters, postfix evaluation).
- Preserve stack state while processing (save/restore).
- Analyze runtime at a high level for stack operations.

## What you will implement
1. `StackWarmup` — small utilities with a stack.
2. `BalancedBrackets` — check if (), [], {} are balanced.
3. `PostfixEvaluator` — evaluate integer postfix expressions.
4. `StackAlgorithms` — compute `max` while **preserving** the original stack.
5. `Driver` — run sample demos (optional to edit).

> **Do not use queues.** Focus only on stacks.

## Constraints
- Use only these `Stack` operations: `push`, `pop`, `peek`, `isEmpty`, `size`.
- Do **not** iterate the stack by index (i.e., do not use `get(i)`).
- Do not use additional collections unless instructed (you may use a second `Stack` as a helper).

## How to compile and run
```bash
javac *.java
java Driver
```
You may also test individual classes with your own `main` methods.

## Grading rubric (10 points)
See the rubric at the end of `Assignment.md`.

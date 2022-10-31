package coroutines

/*

In a real application, you will be launching a lot of coroutines.
Structured concurrency ensures that they are not lost and do not leak.
An outer scope cannot complete until all its children coroutines complete.
Structured concurrency also ensures that any errors in the code are properly reported and are never lost.
 */
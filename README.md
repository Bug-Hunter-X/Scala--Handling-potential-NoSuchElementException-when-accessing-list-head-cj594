# Scala: Handling Potential NoSuchElementException

This example demonstrates a common error in Scala when working with lists: attempting to access the head of an empty list.  The code provided attempts to find the first even number in a list. However, it doesn't handle the case where no even numbers exist, leading to a `NoSuchElementException`.

The solution demonstrates how to safely handle this situation using pattern matching or the `headOption` method.
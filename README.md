# Unexpected Behavior of removeIf on Lists and Sets in Kotlin

This example demonstrates a subtle difference in the behavior of the `removeIf` function when used with `MutableList` and `MutableSet` in Kotlin.  The unexpected behavior stems from how `removeIf` iterates and modifies the collection.

Specifically, while `removeIf` correctly removes elements from a `MutableList` that satisfy a given condition, its interaction with `MutableSet` may seem unexpected due to the nature of sets. Because sets are unordered collections, elements are not necessarily removed in a predictable way.

The `bug.kt` file contains the original code showcasing this behavior. The `bugSolution.kt` file offers a clearer understanding of the behavior with comments. 

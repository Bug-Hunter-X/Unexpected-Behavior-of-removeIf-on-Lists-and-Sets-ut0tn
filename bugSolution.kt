fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it > 3 } // Iterates sequentially; safe removal
    println("List after removeIf: $list") // Output: [1, 2, 3]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    set.removeIf { it > 3 }  // Removal order is not guaranteed in sets.
    println("Set after removeIf: $set") // Output: [1, 2, 3]  Order may vary

    // Safer alternative if order matters: Iterate and create a new Set
    val newSet = set.filter { it <= 3 }.toSet()
    println("Set after filtering and converting: $newSet")
    
}
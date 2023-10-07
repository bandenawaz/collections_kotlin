/*
List:

Lists store items in the order that they are added, and allow for duplicate items.

To create read-only list, we use listOf() function

To create mutable list, we use mutableList() function
 */

fun main(){

   // read-only list
    val readOnlyShapes = listOf("triangle", "square","circle")

    println(readOnlyShapes)

    // mutable list
    val mutableList: MutableList<String> = mutableListOf("triangle", "square","circle")
    println(mutableList)

    //to avoid unwanted modification, we can obtain read-only views of mutable lists
    //by assigning them to a List

    val shapes : MutableList<String> = mutableListOf("triangle", "square","circle")
    val shapesLocked: List<String> = shapes
    println(shapesLocked)

    // Lists ae ordered so to access an item in a list, we use indexed access operator []
    println("The first item in a list is : ${readOnlyShapes[0]}")

    //to get the first and last item in a list we use .first() and .last() functions respectively
    println("The first item in the list is ${readOnlyShapes.first()} and last item in a list is ${readOnlyShapes.last()}")

    //To get the number of items in a list we use .count() functions
    println("The number of items in a list is ${readOnlyShapes.count()}")

    //To check the item in a list we use 'in' operator
    println("circle" in readOnlyShapes)

    //to add or remove items from the list we use .add() and .remove() functions respectively
    shapes.add("pentagon")
    println(shapes)

    shapes.remove("pentagon")
    println(shapes)
}
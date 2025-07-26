fun main(){
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)

    val shapes: MutableList<String> = MutableList("triangle", "square", "circle")
    println(shapes)
}
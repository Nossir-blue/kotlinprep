# Kotlin

## Basic stuff

**functions** in kotlin are written like this `fun functoinName(){}`

**println() and print()** servem para printar na tela

## Variáveis

Em Kotlin, variáveis são declaradas da seguinte forma:
`val popcorn = 2`
`var ninja = 1`
 
onde:
- **val** -> variável immutavel (equivalente à *const* em js)
- **var** -> variável mutável

variáveis podem ser declaradas fora de escopo

## String templates or string interpolation

**$nomeDaVar** ou **${nomeDaVar}**, obviamente dentro de um print néh

## Basic types

Kotlin normalmente tem type inference but i can basically define the data types myself if i want to (which is a must because less processing and i like explicit stuff)

<table>
    <tr>
        <th>Category</th>
        <th>Basic types</th>
        <th>Example code</th>
    </tr>
    <tr>
        <td>Integer</td>
        <td>Byte, Short, Int, Long</td>
        <td>val year: Int = 200</td>
    </tr>
    <tr>
        <td>Unsigned Integers</td>
        <td>UByte, UShort, UInt, ULong</td>
        <td>val score: UInt = 100u</td>
    </tr>
    <tr>
        <td>Floating-point-numbers</td>
        <td>Float, Double</td>
        <td>val currentTemp: Float = 24.5f, val price: Double = 19.99</td>
    </tr>
    <tr>
        <td>Booleans</td>
        <td>Boolean</td>
        <td>val isEnabled: Boolean = true</td>
    </tr>
    <tr>
        <td>Character</td>
        <td>Char</td>
        <td>val separator: Char = ','</td>
    </tr>
    <tr>
        <td>Strings</td>
        <td>String</td>
        <td>val message: String = "Hello, world!</td>
    </tr>
</table>

As you can see, this way i'm able to declare them without initializing them

**Note**: They are writen with the char[0].toUpperCase (lol, basically they are capitalized in the first letter)

And now, let's move on to...

## Collections

Basically some data structures, you're already familiar with them, you know java and javascript

> Bro, Nine Vicious is a banger gahdamn

So, quais são os tipos de collections?
Simples mano, bué simples:

<table>
    <tr>
        <th>Collection type</th>
        <th>Description</th>
    </tr>
    <tr>
        <td>List</td>
        <td>Ordered collections of items</td>
    </th>
    <tr>
        <td>Sets</td>
        <td>Unique unordered collection of items</td>
    </th>
    <tr>
        <td>Maps</td>
        <td>Sets of key-value pairs where keys are unique and map to only one value</td>
    </th>
</table>

Podem ser mutáveis ou read-only

### List

Listas guardam items em ordem e permitem duplicates

**Nota**: Isso se aplica no tópico completo de collections, you can define readonly lists and mutable lists

In this case, read-only lists are like this:
`listOf()`
to create a mutable list, do it as follow:
`mutableListOf()`

They are either type infered or type defined
To define their type, just add a `<>` with their type inside (bro, for a language deemed to be "Java but simpler", they sure found a way to make it sort of confusing to learn with all this stuff but anyways)

<code>
fun main(){
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)

    val shapes: MutableList<String> = MutableList("triangle", "square", "circle")
    println(shapes)
}
</code>

Basicamente, para criar listas mutáveis com inferência de dados é da forma que está em cima
Sem inferência de dados é a que está em baixo mas como não entendi, vou tentar entender
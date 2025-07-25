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
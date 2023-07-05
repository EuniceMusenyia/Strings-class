fun main() {
//a string is a collection of characters
    // index(position) of characters is counted from 0, 1,2...
    // we use // to allow printing of double quotes inside the string. i.e "mary says \"hello there?\""
    //the operator == is used to compare strings ... can also use.equals
    // println(place.replaceFirst('m','M'))
    // **replace

    //ctrl + b press to see more information/explanation of the code

    var location = "San Franciscoi"
    location= "New york"
    println(location)
    var greet = "mary says \"hello there?\""
    println(greet)

    val currency= "UGX"
    val item = "chicken"
    val amount = 20000

    val sentence = "The price of a "+ item +" is "+ amount+" "+currency
    val sentence2 = "The price of a $item is $amount$currency"
    println(sentence)
    println(sentence2)

    val place= "mombasa"
    val place2= "Mombasa"
    println(place == place2)
    println(place.equals(place2))

    println(place.uppercase())
    println(place.lowercase())
    println(place.replaceFirst('m','M'))

    val a= ""
    val b = " "
    println(b.isEmpty())
    println(b.isBlank())

    val fruit = " avocado mango apple"
    println(fruit.trimStart())
    println(fruit.trimEnd())
    println(fruit.trim())
    println(fruit.indexOf(" "))
    //replace

    println(fruit.split(""))
    println(fruit.split("a"))

    val fruit2 = "avocado mango apple banana"
    println(fruit2.split(", "))







}
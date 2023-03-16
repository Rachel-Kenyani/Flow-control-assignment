fun main() {
    //Q.1
    numbers()

    //Q.2
    println( identity(arrayOf("Brianna","Miriam","Kenyani","Benjamin")))

    //Q.3
    party(2)
    party(14)
    party(45)

    //Q.4
    digits()
}
//Question 1
//Create a function that prints out all the
// odd numbers between 1 and 100
fun numbers(){
    for (n in 0..100){
    if(n%2==1){
        println(n)
    }
    }
}

//Question 2
//Create a function that takes in an array of names and returns
// the number of names longer than 5 characters
fun identity(names:Array<String>): Int{
    for (name in names){
        if (name.length> 5){

        }
    }
    return names.count()
}


//Question 3
//Takes in ages(below 6=milk, 6-15=Fanta orange, else=Coca-Cola
//prints out name of the drink and their age
fun party(ages:Int){
    when(ages){
        in 0..5 -> println("You are $ages years old. Please take a glass of milk.")
        in 6 ..15 -> println("You are $ages years old. Please take a bottle of Fanta Orange.")
        else -> println("You are $ages years old. Please take a bottle of Coca Cola.")
    }
}


//Question 4
fun digits(){
    for (digit in 0..100){
        if(digit%5==0 && digit%3==0){
            println("FrizzBuzz")
        }
        else if(digit%5==0){
            println("Buzz")
        }
        else if(digit%3==0){
            println("Frizz")
        }
        else{
            println(digit)
        }
    }
}







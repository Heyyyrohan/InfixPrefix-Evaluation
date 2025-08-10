package com.example.infixtoprefix

fun main(){
    finalEvaluation()

}

fun finalEvaluation(){

    println("Enter the Infix Expression : ")
    val infixEx = readLine().toString()
    val revInfix = revInfix(infixEx)
    val toPostfix = infixToPostfix(revInfix)

    val finalAns = revInfix(toPostfix)

    println("The Prefix of $infixEx is  : $finalAns ")

}
//If input is --> (a-b/c)*(a/k-l)
//Output Should be --> *-a/bc-/akl
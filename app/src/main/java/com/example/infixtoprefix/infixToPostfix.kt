package com.example.infixtoprefix

fun infixToPostfix( infix : String): String{
    val stackPostfix = java.util.Stack<Char>()
    val result = StringBuilder()

    for(ch in infix){

        when{
            ch.isLetterOrDigit() -> result.append(ch)
            ch == '(' -> stackPostfix.push(ch)
            ch == ')' -> {

                while(stackPostfix.isNotEmpty() && stackPostfix.peek() != '('){
                    result.append(' ').append(stackPostfix.pop())
                }
                if(stackPostfix.isNotEmpty() && stackPostfix.peek() == '('){
                    stackPostfix.pop()
                }

            }
            isOperator(ch) -> {
                result.append(' ')
                while (stackPostfix.isNotEmpty() && precedence(ch) <= precedence(stackPostfix.peek())){

                    result.append(stackPostfix.pop()).append(' ')
                }
                stackPostfix.push(ch)
            }
        }

    }

    while(stackPostfix.isNotEmpty()){
        result.append(' ').append(stackPostfix.pop())
    }

    return result.toString()
}

fun isOperator( ch : Char ) : Boolean {
    return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^'
}

fun precedence( op : Char ) : Int = when(op){

    '+','-' -> 1
    '*','/' -> 2
    '^', -> 3
    else -> -1

}
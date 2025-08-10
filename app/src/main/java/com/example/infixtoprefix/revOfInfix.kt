package com.example.infixtoprefix

fun revInfix( infix : String) : String {
    val stack = java.util.Stack<Char>()
    val res = StringBuilder()

        for(c in infix.replace(" ","")){

            when{
                c == '(' -> stack.push(')')
                c == ')' -> stack.push('(')
                else -> stack.push(c)
            }

        }
    while(stack.isNotEmpty()){
        res.append(stack.pop())
    }

    return res.toString()
}
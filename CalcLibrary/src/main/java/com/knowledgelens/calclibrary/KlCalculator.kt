package com.knowledgelens.calclibrary

import java.lang.IllegalArgumentException

class KlCalculator {
    companion object{
        fun plus(a:Int,  b:Int):Int{
            return a+b
        }

        fun minus(a:Int,  b:Int):Int{
            return a-b
        }

        fun product(a:Int,  b:Int):Int{
            return a*b
        }

        fun division(a:Int,  b:Int):Int{
            if(b==0){
                throw IllegalArgumentException("Div by zero error")
            }
            else{
                return a/b
            }
        }
    }
}
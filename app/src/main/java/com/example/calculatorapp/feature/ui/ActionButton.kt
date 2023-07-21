package com.example.calculatorapp.feature.ui

import androidx.compose.ui.graphics.Color
import com.example.calculatorapp.ui.theme.BottomBlue
import com.example.calculatorapp.ui.theme.BottomPink
import com.example.calculatorapp.ui.theme.BottomYellow

sealed class ActionButton(val symbol:String , val buttonColor: Color){
     data class Number(val number: Int): ActionButton(number.toString() ,BottomBlue)
     data class Operator(val operation: Operators):ActionButton(operation.symbol ,BottomPink)

    object Calculate:ActionButton("=", BottomYellow)
    object Delete:ActionButton("-",BottomBlue)
    object Clear:ActionButton("AC" ,BottomPink)
    object Decimal:ActionButton(".",BottomBlue)
    object Percentage:ActionButton("%" ,BottomPink)


}

sealed class Operators(val symbol: String){
    object Add: Operators("+")
    object Subtract: Operators("-")
    object Multiply: Operators("*")
    object Divide: Operators("/")
    object Power: Operators("^")


}

package com.example.calculatorapp.feature.ui


import androidx.compose.runtime.State
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.map

class CalcViewModel : ViewModel() {
    private val state: MutableStateFlow<State> = MutableStateFlow(State())
    private val viewState = state
        .map { state ->
            val num1 = state.num1.ifEmpty { "0" }
            val operators = state.operators?.symbol.orEmpty()
            val num2 = state.num2
             ViewState("$num1 $operators $num2")


        }
     fun dispatch(action: ActionButton){
         when(action){
             is ActionButton.Number -> onNumberClicked(action.number)
             is ActionButton.Number -> onCalculatelicked()
             is ActionButton.Number -> onClearClicked()
             is ActionButton.Number -> onDecimalClicked()
             is ActionButton.Number -> onDeleteClicked()
             is ActionButton.Number -> onOperatorsClicked()
             is ActionButton.Percentage ->{}

         }

     }

     private fun  onOperatorsClicked(operators: Operators){
         val currentState = state.value
         if (currentState.num1.isEmpty() && currentState.operators = null){
             state.value = currentState.copy(operators = operators)
         }

     }

    internal class ViewState(val result: String)

    private  data class State(
        val num1: String = "",
        val operators: Operators? = null,
        val num2: String = "",
    )
}
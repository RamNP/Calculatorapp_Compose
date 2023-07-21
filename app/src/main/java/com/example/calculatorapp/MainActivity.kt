package com.example.calculatorapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.calculatorapp.feature.CalcButtonComponent
import com.example.calculatorapp.feature.CalcButtonComponentPreview
import com.example.calculatorapp.feature.ui.ActionButton
import com.example.calculatorapp.feature.ui.InputDisplayComponent
import com.example.calculatorapp.feature.ui.Operators
import com.example.calculatorapp.ui.theme.CalculatorAppTheme
import com.example.calculatorapp.ui.theme.spacing

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


            ScreenCalc()
        }
    }
}

@Composable
fun ScreenCalc() {
    Surface(
        color = MaterialTheme.colorScheme.background,
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .padding(horizontal = MaterialTheme.spacing.lg, vertical = MaterialTheme.spacing.sm)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomCenter)

            ) {
                InputDisplayComponent(result = "0")
                Spacer(modifier = Modifier.height(MaterialTheme.spacing.lg))
                CalcButtonsGirdLayout()

            }

        }

    }

}

@Composable
fun CalcButtonsGirdLayout() {

    val buttons = listOf(
        ActionButton.Clear ,
        ActionButton.Operator(Operators.Power),
        ActionButton.Percentage,
        ActionButton.Operator(Operators.Divide),
        ActionButton.Number(7),
        ActionButton.Number(8),
        ActionButton.Number(9),
        ActionButton.Operator(Operators.Multiply),
        ActionButton.Number(4),
        ActionButton.Number(5),
        ActionButton.Number(6),
        ActionButton.Operator(Operators.Subtract),
        ActionButton.Number(3),
        ActionButton.Number(2),
        ActionButton.Number(1),
        ActionButton.Operator(Operators.Add),
        ActionButton.Number(0),
        ActionButton.Decimal,
        ActionButton.Delete,
        ActionButton.Calculate,


    )

    LazyVerticalGrid(columns = GridCells.Fixed(4), content = {
        items(buttons) {
            CalcButtonComponent(
                modifier = Modifier.aspectRatio(1f),
                color = it.buttonColor,
                symbol = it.symbol,
                onClick = {}
            )

        }

    })

}


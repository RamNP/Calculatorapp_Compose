package com.example.calculatorapp.feature.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.calculatorapp.ui.theme.ButtonShadowColorBottom
import com.example.calculatorapp.ui.theme.ButtonShadowColorTop
import com.example.calculatorapp.ui.theme.CalculatorAppTheme

@Composable
fun InputDisplayComponent(result: String) {

    Box(
        Modifier
            .fillMaxWidth()
            .shadow(
                color = ButtonShadowColorTop,
                offsetX = (4).dp,
                offsetY = (4).dp,
                bluerRadius = 8.dp
            )
            .shadow(
                color = ButtonShadowColorBottom,
                offsetX = (4).dp,
                offsetY = (4).dp,
                bluerRadius = 8.dp
            )
            .clip(MaterialTheme.shapes.large)
            .background(MaterialTheme.colorScheme.primary)
            .padding(
                vertical = 0.dp,
                horizontal = 0.dp
            )
    ){
        Text(
            text = result,
            overflow = TextOverflow.Visible,
            maxLines = 1,
            style = MaterialTheme.typography.headlineLarge.merge(TextStyle(textAlign = TextAlign.End)),
            modifier = Modifier.fillMaxWidth()
         )

    }
}

@Preview(showBackground = true)
@Composable
fun InputDisplayComponentPreview() {
    CalculatorAppTheme {
        Box(modifier = Modifier.padding(10.dp)) {

            InputDisplayComponent(result = "1 + 100 =101")


        }

    }

}
package com.example.guess.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun TextInputField(
    value: String,
    onValueChange: (String) -> Unit,
    placeHolder: String
) {
    TextField(
        value = value,
        onValueChange = { newValue ->
            onValueChange(newValue)
        },
        placeholder = { Text(text = placeHolder) },
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .clip(shape = RoundedCornerShape(12.dp)),
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color(0xFFF2F7FD),
            unfocusedContainerColor = Color(0xFFF2F7FD),
            focusedIndicatorColor = Color(0xFFF2F7FD),
            unfocusedIndicatorColor = Color(0xFFF2F7FD)
        )
    )
}

@Composable
fun AppTextField(
    modifier: Modifier = Modifier,
    onValueChange: ((input: String) -> Unit)? = null,
    value: String = "",
    label: String,
    enabled: Boolean = true,
    keyboardType: KeyboardType = KeyboardType.Text,
    marginTop: Dp = 0.dp,
    marginBottom: Dp = 0.dp,
    marginLeft: Dp = 0.dp,
    marginRight: Dp = 0.dp
) {
    TextField(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(top = marginTop, bottom = marginBottom, start = marginLeft, end = marginRight),
        textStyle = TextStyle(color = Color.Black),
        value = value,
        enabled = enabled,
        onValueChange = { onValueChange?.invoke(it) },
        label = { Text(label) },
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType)
    )
}
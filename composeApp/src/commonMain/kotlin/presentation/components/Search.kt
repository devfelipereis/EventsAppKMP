package presentation.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Search(
    placeholderText: String,
    onSearch: (() -> Unit)? = null
) {
    var value by rememberSaveable { mutableStateOf("") }

    TextField(
        value,
        onValueChange = { value = it },
        keyboardActions = KeyboardActions(
            onSearch = {
                if (onSearch != null) {
                    onSearch()
                }
            }
        ),
        keyboardOptions = KeyboardOptions(
            imeAction = ImeAction.Search
        ),
        singleLine = true,
        placeholder = {
            Text(
                placeholderText,
                fontSize = 14.sp,
                color = Color(0xFFB5B6B8)
            )
        },
        leadingIcon = {
            Icon(
                Icons.Default.Search,
                contentDescription = "",
                modifier = Modifier.padding(start = 16.dp).size(26.dp),
                tint = Color(0xFF101010)
            )
        },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Transparent,
            unfocusedBorderColor = Color.Transparent,
            backgroundColor = Color.White,
            textColor = Color(0xFFB5B6B8)
        ),
        shape = RoundedCornerShape(50.dp),
        modifier = Modifier.border(1.dp, Color(0xFFF1F2F4), RoundedCornerShape(50.dp)),
    )
}
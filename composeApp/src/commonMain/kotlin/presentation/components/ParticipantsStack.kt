package presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage

@Composable
fun ParticipantsStack(showCount: Boolean = true, size: Dp = 12.dp) {
    val participants = listOf(
        "https://randomuser.me/api/portraits/men/52.jpg",
        "https://randomuser.me/api/portraits/women/56.jpg",
        "https://randomuser.me/api/portraits/men/55.jpg",
        "https://randomuser.me/api/portraits/women/9.jpg",
        "https://randomuser.me/api/portraits/women/64.jpg"
    )
    Row(horizontalArrangement = Arrangement.spacedBy((-4).dp)) {
        for (participant in participants)
            Box(
                modifier = Modifier.size(size)
                    .border(0.5.dp, Color.White, CircleShape)
                    .clip(CircleShape)

            ) {
                AsyncImage(
                    model = participant,
                    contentDescription = null,
                )
            }
        if (showCount)
            Box(
                modifier = Modifier.size(size)
                    .background(Color(0xFF5E71FF), CircleShape)
                    .border(0.5.dp, Color.White, CircleShape)
            ) {
                Text(
                    "+8k",
                    style = TextStyle(fontSize = 4.sp, color = Color.White),
                    modifier = Modifier.align(Alignment.Center)
                )
            }
    }
}
package presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage

@Composable
fun PopularEventCard() {
    Box(
        modifier = Modifier
            .height(142.dp)
            .fillMaxWidth()
            .shadow(
                elevation = 8.dp,
                shape = RoundedCornerShape(size = 16.dp),
                clip = true
            )
    ) {
        AsyncImage(
            model = "https://images.pexels.com/photos/787961/pexels-photo-787961.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
            contentDescription = null,
            contentScale = ContentScale.Crop
        )

        Box(modifier = Modifier.padding(8.dp)) {
            ParticipantsStack(showCount = false, size = 16.dp)
        }

        Box(
            modifier = Modifier.fillMaxWidth()
                .padding(8.dp)
                .height(42.dp)
                .clip(RoundedCornerShape(size = 8.dp))
                .background(Color.White)
                .padding(8.dp)
                .align(Alignment.BottomCenter)
        ) {

            Column(
                verticalArrangement = Arrangement.spacedBy(4.dp),
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        "Tribute to Didi Kempot",
                        style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 12.sp)
                    )

                    Text(
                        "$20",
                        style = TextStyle(
                            fontSize = 12.sp,
                            color = Color(0xFF5E71FF),
                            fontWeight = FontWeight.Bold
                        )
                    )
                }

                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        "Denny Caknan",
                        style = TextStyle(
                            fontSize = 8.sp,
                            color = Color(0xFF787878),
                        )
                    )

                    Text(
                        "November 7 2022",
                        style = TextStyle(
                            fontSize = 8.sp,
                            color = Color(0xFF787878),
                        )
                    )
                }


            }
        }
    }
}
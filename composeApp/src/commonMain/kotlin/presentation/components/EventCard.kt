package presentation.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import compose.icons.FeatherIcons
import compose.icons.feathericons.Calendar
import compose.icons.feathericons.ChevronRight
import compose.icons.feathericons.Clock
import domain.model.Event

@Composable
fun EventCard(event: Event) {
    val cardShape = RoundedCornerShape(size = 8.dp)
    Card(
        shape = cardShape,
        modifier = Modifier.border(1.dp, Color(0xFFF1F2F4), cardShape)
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(8.dp),
        ) {
            AsyncImage(
                model = "https://images.pexels.com/photos/433452/pexels-photo-433452.jpeg",
                contentDescription = null,
                modifier = Modifier
                    .shadow(
                        elevation = 8.dp,
                        shape = cardShape,
                    )
            )
            Text(
                text = event.name,
                style = TextStyle(
                    fontSize = 12.sp,
                    color = Color(0xFF2F3235),
                    fontWeight = FontWeight.Bold,
                ),
                maxLines = 1
            )
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        FeatherIcons.Calendar,
                        contentDescription = null,
                        tint = Color(0xFF969696),
                        modifier = Modifier.size(10.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        "Nov 10 2022",
                        style = TextStyle(
                            fontSize = 8.sp,
                            color = Color(0xFFBEBEBE),
                        )
                    )
                }

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        FeatherIcons.Clock,
                        contentDescription = null,
                        tint = Color(0xFF969696),
                        modifier = Modifier.size(10.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        "08.00 PM",
                        style = TextStyle(
                            fontSize = 8.sp,
                            color = Color(0xFFBEBEBE),
                        ),
                    )
                }
            }
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                ParticipantsStack()
                Row(
                    horizontalArrangement = Arrangement.spacedBy(4.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        "Buy Ticket",
                        style = TextStyle(
                            fontSize = 8.sp,
                            color = Color(0xFF5E71FF),
                            fontWeight = FontWeight.Bold
                        )
                    )
                    Icon(
                        FeatherIcons.ChevronRight,
                        contentDescription = null,
                        tint = Color(0xFF5E71FF),
                        modifier = Modifier.size(8.dp)
                    )
                }
            }

        }
    }
}
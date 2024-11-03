package com.example.pw9

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pw9.ui.theme.Pw9Theme
import com.example.pw9.ui.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pw9Theme {
                Column {
                    Text(modifier = Modifier.padding(top = 30.dp).align(Alignment.CenterHorizontally), style = Typography.titleLarge, text = "Профиль студента")
                    StudentCard()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun StudentCard() {
    Card(
        modifier = Modifier.fillMaxWidth().padding(20.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 5.dp
        )
    ) {
        Box(
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Column (
                modifier = Modifier.padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    modifier = Modifier.size(248.dp).clip(CircleShape),
                    painter = painterResource(id = R.drawable.hihihaha),
                    contentDescription = "image",
                    contentScale = ContentScale.Crop)

                Text(modifier = Modifier.padding(top = 10.dp), style = Typography.bodyMedium, text = "Зарипов Рустам Сафарбекович")
                Text(modifier = Modifier.padding(top = 10.dp), style = Typography.bodySmall, text = "Группа: ИКБО-28-22")
            }
        }
    }
}
package com.example.chatappuispy.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chatappuispy.R

@Composable
fun StartScreen() {

    Column(
        modifier = Modifier

        .fillMaxSize()

        .background(color = Color.Black)) {
        
        Image(painter = painterResource(id = R.drawable.frame1), contentDescription = "" ,
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.Crop)

        Text(text = "Stay Connected" ,
            fontSize = 41.sp,
            lineHeight = 30.sp,
            fontWeight = FontWeight.Bold
            )

        Row(modifier = Modifier.fillMaxWidth()){

         Icon(
             imageVector = Icons.Default.CheckCircle,
             contentDescription = "",
             modifier = Modifier.size(25.dp)
         )
            Text(text = "Secure , Private Messaging")
        }
        Button(onClick = {   }) {

            Text(text = "GET STARTED", fontSize = 20.sp, fontWeight = FontWeight.Bold)

            }

    }
}



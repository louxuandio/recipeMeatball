package com.example.recipemeatball

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.recipemeatball.ui.theme.RecipeMeatballTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.HorizontalDivider

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent{
            RecipeMeatballTheme {

                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ) {
                    Row (
                        modifier = Modifier.padding(horizontal = 16.dp)
                    ){
                        Text(
                            "Crock Pot Party Meatballs",
                            modifier = Modifier
                                .padding(bottom = 8.dp)
                                .weight(1f),
                            style = TextStyle(
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                        Icon(
                            imageVector = Icons.Filled.Star,
                            contentDescription = "Save Button",
                            tint = Color.Gray
                        )
                    }

                    HorizontalDivider(
                        modifier = Modifier
                            .fillMaxWidth(),
                        color = Color.Gray,
                        thickness = 1.dp
                    )

                    Box(
                        modifier = Modifier
                            .wrapContentSize()
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.download),
                            contentDescription = "Food Image",
                            modifier = Modifier
                                .size(300.dp)
                                .padding(top = 8.dp)
                                .align(Alignment.TopStart)
                        )
                    }

                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 8.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(8.dp),
                            verticalArrangement = Arrangement.spacedBy(6.dp)
                        ) {

                            Text("Ingredients:",
                                style = TextStyle(
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            )
                            Text("• 1 (2 pound) bag frozen cooked meatballs")
                            Text("• 1 (14 ounce) can whole berry cranberry sauce")
                            Text("• 1 (12 ounce) bottle tomato-based chili sauce")
                            Text("• ½ lemon, juiced")
                            Text("• 2 drops hot sauce (such as Tabasco), or more to taste")
                        }
                    }


                    Column (
                        modifier = Modifier
                            .padding(8.dp)
                            .padding(top = 8.dp) ,
                        verticalArrangement = Arrangement.spacedBy(6.dp)
                    ){
                        Text(
                            "Directions",
                            modifier = Modifier
                                .align(Alignment.Start),
                            style = TextStyle(
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                        Text(
                            "Step 1",
                            modifier = Modifier
                                .align(Alignment.Start)
                                .padding(top = 8.dp),
                            style = TextStyle(
                                fontWeight = FontWeight.Bold
                            )
                        )
                        Text("Place meatballs, cranberry sauce, chili sauce, lemon juice, and hot sauce in a slow cooker; stir to evenly distribute sauce.")
                        Text(
                            "Step 2",
                            modifier = Modifier
                                .align(Alignment.Start)
                                .padding(top = 8.dp),
                            style = TextStyle(
                                fontWeight = FontWeight.Bold
                            )
                        )
                        Text("Cook on High until meatballs completely thawed and hot, about 3 hours.")
                    }

                }

            }
        }
    }


}


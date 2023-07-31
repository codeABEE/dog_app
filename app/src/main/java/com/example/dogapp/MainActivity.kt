package com.example.dogapp

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dogapp.ui.theme.DogAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DogAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    DogInfoApp()
                }
            }
        }
    }
}

@Composable
fun DogInfoApp() {
   Column(
       modifier = Modifier
           .fillMaxWidth()
           .padding(16.dp)
           .background(Color.Cyan)
           //.border(width = 1.dp, color = Color.Blue)

   ) {

       Column(
           modifier = Modifier
               .height(150.dp)
               .fillMaxWidth()
               .padding(8.dp)
               .shadow(1.dp)




       ) {
           Row(modifier = Modifier.weight(1f)) {

               DogImages(dogImage = painterResource(id = R.drawable.dog_black))
               DogAppInfoCard(
                   dogName = stringResource(id = R.string.dog_1_name),
                   dogBreed = stringResource(id = R.string.dog_1_breed),
                   dogGender = stringResource(id = R.string.dog_1_gender) ,
                   modifier = Modifier.weight(2f) )

           }

       }

       Column(
           modifier = Modifier
               .height(150.dp)
               .fillMaxWidth()
               .padding(8.dp)
               .shadow(1.dp)



       ) {
           Row(modifier = Modifier.weight(1f)) {

               DogImages(dogImage = painterResource(id = R.drawable.dog_blacky))
               DogAppInfoCard(
                   dogName = stringResource(id = R.string.dog_2_name),
                   dogBreed = stringResource(id = R.string.dog_2_breed),
                   dogGender = stringResource(id = R.string.dog_2_gender) ,
                   modifier = Modifier.weight(2f) )

           }

       }

       Column(
           modifier = Modifier
               .height(150.dp)
               .fillMaxWidth()
               .padding(8.dp)
               .shadow(1.dp)



       ) {
           Row(
               modifier = Modifier.weight(1f)

           ) {

               DogImages(dogImage = painterResource(id = R.drawable.dog_rotweiler))
               DogAppInfoCard(
                   dogName = stringResource(id = R.string.dog_3_name),
                   dogBreed = stringResource(id = R.string.dog_3_breed),
                   dogGender = stringResource(id = R.string.dog_3_gender) ,
                   modifier = Modifier.weight(2f) )

           }

       }

       Column(
           modifier = Modifier
               .height(150.dp)
               .fillMaxWidth()
               .padding(8.dp)
               .shadow(1.dp)



       ) {
           Row(modifier = Modifier.weight(1f)) {

               DogImages(dogImage = painterResource(id = R.drawable.dog_sandy))
               DogAppInfoCard(
                   dogName = stringResource(id = R.string.dog_4_name),
                   dogBreed = stringResource(id = R.string.dog_4_breed),
                   dogGender = stringResource(id = R.string.dog_4_gender) ,
                   modifier = Modifier.weight(2f) )

           }

       }

      Column(
          modifier = Modifier
              .height(150.dp)
              .fillMaxWidth()
              .padding(8.dp)
              .shadow(1.dp)
      
      ) {
          
          Row(modifier =  Modifier.weight(1f)) {
              
              DogImages(dogImage = painterResource(id = R.drawable.dog_rotweiler))
              DogAppInfoCard(
                  dogName = stringResource(id = R.string.dog_5_name) ,
                  dogBreed = stringResource(id = R.string.dog_5_breed), 
                  dogGender = stringResource(id = R.string.dog_5_gender), 
                  modifier = Modifier.weight(2f) )
              
          }
          
      }


       
   }
    
}

@Composable
fun DogImages(
    dogImage: Painter, 
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .padding(start = 16.dp, top = 16.dp, bottom = 16.dp, end = 16.dp)


    ) {
        Image(
            painter = dogImage, 
            contentDescription = null )
        
    }
}


@Composable
fun DogAppInfoCard(dogName: String, dogBreed: String, dogGender: String, modifier: Modifier) {

    Column(
        modifier = Modifier
            .padding(top = 0.dp, bottom = 0.dp)


    ) {
        Text(
            text = dogName,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Monospace,
            fontSize = 20.sp,
            color = Color.Blue,
            modifier = Modifier
               .padding(top = 20.dp, bottom = 20.dp)



        )
        Text(
            text = dogBreed,
            modifier = Modifier
                .padding( bottom = 20.dp),
            fontFamily = FontFamily.Monospace,

        )
        Text(
            text = dogGender,
            modifier = Modifier
                .padding( bottom = 20.dp),
            fontFamily = FontFamily.Monospace
    )
    

    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DogAppTheme {
        DogInfoApp()
    }
}
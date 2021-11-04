package aleksey.vasiliev.lab3_4

import aleksey.vasiliev.lab3_4.Shared.BottomNavigationBar
import aleksey.vasiliev.lab3_4.ui.theme.Lab3_4Theme
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class FirstActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab3_4Theme {
                Scaffold(
                    topBar = { TopAppBar(title = { Text("First") }) },
                    bottomBar = { BottomNavigationBar(this) },
                    content = { Layout() })
            }
        }
    }

    @Composable
    fun Layout() {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Button(onClick = {
                startActivity(
                    Intent(
                        this@FirstActivity,
                        SecondActivity::class.java
                    )
                )
            }) {
                Text("Second")
            }
            Spacer(modifier = Modifier.height(20.dp))
            Button(onClick = {
                startActivity(
                    Intent(
                        this@FirstActivity,
                        ThirdActivity::class.java
                    )
                )
            }) {
                Text("Third")
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        Lab3_4Theme {
            BottomNavigationBar(this)
        }
    }

    override fun onBackPressed() {
        finish()
    }
}


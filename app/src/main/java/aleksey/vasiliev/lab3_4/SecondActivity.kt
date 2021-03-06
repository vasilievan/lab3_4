package aleksey.vasiliev.lab3_4

import aleksey.vasiliev.lab3_4.Shared.BottomNavigationBar
import aleksey.vasiliev.lab3_4.ui.theme.Lab3_4Theme
import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(
            ComposeView(this).apply {
                setContent {
                    Lab3_4Theme {
                        Scaffold(
                            topBar = { TopAppBar(title = { Text("Second") }) },
                            bottomBar = { BottomNavigationBar(this@SecondActivity) },
                            content = { Layout() })
                    }
                }
                id = R.id.activity_first
            }
        )
    }

    @Composable
    fun Layout() {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Button(onClick = {
                Intent(
                    this@SecondActivity,
                    FirstActivity::class.java
                )
            }) {
                Text("First")
            }
            Spacer(modifier = Modifier.height(20.dp))
            Button(onClick = {
                val intent = Intent(this@SecondActivity, ThirdActivity::class.java)
                startActivity(intent)
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
}


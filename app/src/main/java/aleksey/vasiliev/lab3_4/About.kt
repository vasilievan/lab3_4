package aleksey.vasiliev.lab3_4

import aleksey.vasiliev.lab3_4.Shared.BottomNavigationBar
import aleksey.vasiliev.lab3_4.ui.theme.Lab3_4Theme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(
            ComposeView(this).apply {
                setContent {
                    Lab3_4Theme {
                        Scaffold(
                            topBar = { TopAppBar(title = { Text("About") }) },
                            content = { Spacer(modifier = Modifier.fillMaxSize()) }
                        )
                    }
                }
                id = R.id.activity_about
            }
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        Lab3_4Theme {}
    }

    override fun onBackPressed() {
        finish()
        super.onBackPressed()
    }
}


package io.htueko.androidplayground

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_main_animation_activity.setOnClickListener {
            sendIntent(this@MainActivity, AnimationExamplesActivity::class.java)
        }

    }

    private fun sendIntent(context: Context, cls: Class<*>){
        startActivity(Intent(context, cls))
    }

}

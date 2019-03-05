package io.htueko.androidplayground

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_animation_examples.*

class AnimationExamplesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation_examples)

        btn_animation_examples_fade.setOnClickListener {
            sendIntent(this@AnimationExamplesActivity, AnimFadeActivity::class.java)
        }

    }

    private fun sendIntent(context: Context, cls: Class<*>) {
        startActivity(Intent(context, cls))
    }

}

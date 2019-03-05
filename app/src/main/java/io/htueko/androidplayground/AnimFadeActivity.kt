package io.htueko.androidplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.Group
import androidx.transition.Fade
import androidx.transition.TransitionManager
import kotlinx.android.synthetic.main.activity_anim_fade.*

class AnimFadeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anim_fade)

        val group = findViewById<Group>(R.id.group_anim_fade)
        group.visibility = View.GONE

        val layout: ConstraintLayout = findViewById(R.id.activity_anim_fade_root_layout)

        btn_anim_fade_start.setOnClickListener {
            btn_anim_fade_start.visibility = View.GONE
            val fade = Fade()
            fade.duration = 1000
            TransitionManager.beginDelayedTransition(layout, fade)
            group.visibility = View.VISIBLE
        }

    }
}

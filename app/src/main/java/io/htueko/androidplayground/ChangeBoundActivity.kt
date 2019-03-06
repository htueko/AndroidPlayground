package io.htueko.androidplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.transition.ChangeBounds
import kotlinx.android.synthetic.main.activity_change_bound.*
import android.view.animation.OvershootInterpolator
import androidx.transition.TransitionManager


class ChangeBoundActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_bound)

        val layout: ConstraintLayout = findViewById(R.id.activity_change_bound_rootLayout)
        btn_change_bound_start.setOnClickListener {
            val constraintSet = ConstraintSet()
            constraintSet.clone(this@ChangeBoundActivity, R.layout.activity_change_bound_second)
            constraintSet.applyTo(layout)
            val transition = ChangeBounds()
            transition.interpolator = OvershootInterpolator()
            transition.duration = 1200
            TransitionManager.beginDelayedTransition(layout, transition)
        }

    }
}

package com.jyotsna.motionlayoutproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.motion.widget.MotionLayout
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find MotionLayout by its ID
        val motionLayout = findViewById<MotionLayout>(R.id.motionLayout)
        motionLayout.transitionToEnd()

        // Add listener to the button to trigger the animation manually
        val button = findViewById<Button>(R.id.movingButton)
        button.setOnClickListener {
            if (motionLayout.progress == 1.0f) {
                motionLayout.transitionToStart() // Reverse animation
            } else {
                motionLayout.transitionToEnd() // Trigger animation to end
            }
        }
    }
}

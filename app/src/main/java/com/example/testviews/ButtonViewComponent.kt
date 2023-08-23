package com.example.testviews

import android.content.Context
import android.util.AttributeSet
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Space
import android.widget.TextView



class CustomButtonWithEditText(context: Context, attrs: AttributeSet? = null) : LinearLayout(context, attrs) {

    private val editText: EditText
    private val timestampButton: Button
    private val titleTextView: TextView

    init {
        orientation = VERTICAL


        timestampButton = Button(context)
        timestampButton.text = "Timestamp"
        val buttonLayoutParams = LayoutParams(
            LayoutParams.WRAP_CONTENT,
            LayoutParams.WRAP_CONTENT
        )

        buttonLayoutParams.gravity = Gravity.END
        timestampButton.layoutParams = buttonLayoutParams
        addView(timestampButton)

        titleTextView = TextView(context)
        titleTextView.text = "Notes:"
        titleTextView.textSize = 14f
        titleTextView.gravity = Gravity.BOTTOM
        addView(titleTextView)

// Create and add EditText
        editText = EditText(context)
        editText.hint = "Enter text"
        addView(editText)

        timestampButton.setOnClickListener { editText.text.append("Hello") }

    }
}
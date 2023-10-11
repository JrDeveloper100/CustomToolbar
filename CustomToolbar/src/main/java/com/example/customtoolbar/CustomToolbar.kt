package com.example.customtoolbar

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.Toolbar

class CustomToolbar @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : Toolbar(context, attrs, defStyleAttr) {

    enum class ToolbarDesign {
        DESIGN1, DESIGN2, DESIGN3, DESIGN4
    }

    init {
        // Obtain the custom attribute value
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomToolbar)
        val design = typedArray.getInt(R.styleable.CustomToolbar_toolbarDesign, 0)
        typedArray.recycle()

        // Set the predefined design based on the attribute value
        when (ToolbarDesign.values()[design]) {
            ToolbarDesign.DESIGN1 -> setDesign1()
            ToolbarDesign.DESIGN2 -> setDesign2()
            ToolbarDesign.DESIGN3 -> setDesign3()
            ToolbarDesign.DESIGN4 -> setDesign4()
        }
    }

    fun setDesign1() {
        // Inflate the toolbar design1 layout
        inflate(context, R.layout.toolbar_design1, this)
    }

    fun setDesign2() {
        // Inflate the toolbar design2 layout
        inflate(context, R.layout.toolbar_design2, this)
    }

    fun setDesign3() {
        // Inflate the toolbar design2 layout
        inflate(context, R.layout.toolbar_design3, this)
    }

    fun setDesign4() {
        // Inflate the toolbar design2 layout
        inflate(context, R.layout.toolbar_design4, this)
    }

    // ... Other methods as before
}
package com.sujin.weatherapp.widgets

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.Toolbar
import com.sujin.weatherapp.R
import kotlinx.android.synthetic.main.component_toolbar.view.*

class AppToolbar : Toolbar {
    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    init {
        View.inflate(context, R.layout.component_toolbar, this)
    }

    fun onNavBackPressed(onClickListener: OnClickListener) {
        navigateUp.setOnClickListener(onClickListener)
    }

    fun setTitle(title: String) {
        toolbarTitle.text = title
    }
}
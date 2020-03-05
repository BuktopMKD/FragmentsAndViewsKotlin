package com.denofdevelopers.fragmentsandviews.views

import androidx.constraintlayout.widget.ConstraintLayout
import com.denofdevelopers.fragmentsandviews.HomeActivity
import com.denofdevelopers.fragmentsandviews.R

class ViewTwo(private val activity: HomeActivity) : ConstraintLayout(activity) {

    init {
        inflate(context, R.layout.view_two, this)
    }
}
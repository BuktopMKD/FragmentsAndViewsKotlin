package com.denofdevelopers.fragmentsandviews.views

import androidx.constraintlayout.widget.ConstraintLayout
import com.denofdevelopers.fragmentsandviews.HomeActivity
import com.denofdevelopers.fragmentsandviews.R

class ViewOne(private val activity: HomeActivity) : ConstraintLayout(activity) {

    init {
        inflate(context, R.layout.view_one, this)
    }
}
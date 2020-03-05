package com.denofdevelopers.fragmentsandviews.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.denofdevelopers.fragmentsandviews.R

class FragmentTwo: Fragment() {

    private val TAG = FragmentTwo::class.java.simpleName

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i(TAG, "onCreateView")
        return inflater.inflate(R.layout.fragment_two, container, false)
    }
}
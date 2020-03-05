package com.denofdevelopers.fragmentsandviews

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.denofdevelopers.fragmentsandviews.fragments.FragmentOne
import com.denofdevelopers.fragmentsandviews.fragments.FragmentTwo
import com.denofdevelopers.fragmentsandviews.views.ViewOne
import com.denofdevelopers.fragmentsandviews.views.ViewTwo
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    var fragment: Fragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        fragmentOneButton.setOnClickListener {
            fragment = FragmentOne()
            val transaction =
                supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frame, fragment as Fragment)
            transaction.commit()
        }

        fragmentTwoButton.setOnClickListener {
            val transaction =
                supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frame, FragmentTwo())
            transaction.commit()
        }

        viewButtonOne.setOnClickListener {
            frame.removeAllViews()
            frame.addView(ViewOne(this))
        }

        viewButtonTwo.setOnClickListener {
            frame.removeAllViews()
            frame.addView(ViewTwo(this))
        }
    }

    override fun onBackPressed() {
        val view: View = frame.getChildAt(0)
        if (fragment != null) {
            supportFragmentManager.beginTransaction().remove(fragment!!).commit()
            fragment = null
        } else if (view != null) {
            frame.removeAllViews()
        } else {
            super.onBackPressed()
        }
    }
}

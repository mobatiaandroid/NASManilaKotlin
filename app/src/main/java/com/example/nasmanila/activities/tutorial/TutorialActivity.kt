package com.example.nasmanila.activities.tutorial

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.nasmanila.R
import com.example.nasmanila.activities.login.LoginActivity
import com.example.nasmanila.activities.tutorial.adapter.TutorialViewPagerAdapter
import com.example.nasmanila.constants.IntentPassValueConstants.TYPE
import kotlin.collections.ArrayList

class TutorialActivity : AppCompatActivity() {
    lateinit var imageCircle: Array<ImageView?>
    lateinit var linearLayout: LinearLayout
    lateinit var tutorialViewPager: ViewPager
    lateinit var context: Context
    lateinit var imageSkip: ImageView
    lateinit var tutorialViewPagerAdapter: TutorialViewPagerAdapter
    var dataType = 0

    var tPhotoList = ArrayList(
        listOf(
            R.drawable.tut_1,
            R.drawable.tut_2,
            R.drawable.tut_4,
            R.drawable.tut_6
        )
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorial_acitivity)
        context = this
        val bundle = intent.extras
        if (bundle != null) {
            dataType = bundle.getInt(TYPE, 0)
        }
        initialiseViewPagerUI()
    }
    private fun initialiseViewPagerUI() {
        tutorialViewPager = findViewById(R.id.tutorialViewPager)
        imageSkip = findViewById(R.id.imageSkip)
        tutorialViewPagerAdapter = TutorialViewPagerAdapter(context, tPhotoList)
        tutorialViewPager.currentItem = 0
        tutorialViewPager.adapter = tutorialViewPagerAdapter
        imageSkip.setOnClickListener {
            if (dataType == 0)
                finish()
            else {
                val loginIntent = Intent(context, LoginActivity::class.java)
                startActivity(loginIntent)
                finish()
            }
        }
        tutorialViewPager.setOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                TODO("Not yet implemented")
            }

            override fun onPageSelected(position: Int) {
                TODO("Not yet implemented")
            }

            override fun onPageScrollStateChanged(state: Int) {
                TODO("Not yet implemented")
            }


        })
    }

//    private fun initialiseViewPagerUI() {
//        tutorialViewPager = findViewById<View>(R.id.tutorialViewPager) as ViewPager
//        imageSkip = findViewById<View>(R.id.imageSkip) as ImageView
//        linearLayout = findViewById<View>(R.id.linear) as LinearLayout
//        imageCircle = arrayOfNulls<ImageView>(tPhotoList.size)
//        tutorialViewPagerAdapter = TutorialViewPagerAdapter(context, tPhotoList)
//        tutorialViewPager.currentItem = 0
//        tutorialViewPager.adapter = tutorialViewPagerAdapter
////        addShowCountView(0)
//        imageSkip.setOnClickListener {
//            if (dataType == 0)
//                finish()
//            else {
//                val loginIntent = Intent(context, LoginActivity::class.java)
//                startActivity(loginIntent)
//                finish()
//            }
//        }
//        tutorialViewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
//            override fun onPageScrolled(
//                position: Int,
//                positionOffset: Float,
//                positionOffsetPixels: Int
//            ) {
//            }
//
//            override fun onPageSelected(position: Int) {
//                for (i in 0..tPhotoList.size)
//                    imageCircle[i]?.background = resources.getDrawable(R.drawable.blackround)
//                if (position < tPhotoList.size) {
//                    imageCircle[position]?.background = resources.getDrawable(R.drawable.redround)
//                    linearLayout.removeAllViews()
////                    addShowCountView(position)
//                } else {
//                    linearLayout.removeAllViews()
//                    if (dataType == 0)
//                        finish()
//                    else {
//                        val loginIntent = Intent(context, LoginActivity::class.java)
//                        startActivity(loginIntent)
//                        finish()
//                    }
//                }
//            }
//
//            override fun onPageScrollStateChanged(state: Int) {
//            }
//        })
//        (tutorialViewPager.adapter as TutorialViewPagerAdapter).notifyDataSetChanged()
//    }

//    private fun addShowCountView(count: Int) {
//        var size = tPhotoList.size
//        var i = 0
//        for (i in 0..size) {
//            imageCircle[i] = ImageView(this)
//            val layoutParams = LinearLayout.LayoutParams(
//                resources.getDimension(R.dimen.home_circle_width).toInt(),
//                resources.getDimension(R.dimen.home_circle_height).toInt()
//            )
//            imageCircle[i]?.layoutParams = layoutParams
//            if (i == count) {
//                imageCircle[i]?.setBackgroundResource(R.drawable.redround)
//            } else {
//                imageCircle[i]?.setBackgroundResource(R.drawable.blackround)
//            }
//            linearLayout.addView(imageCircle[i])
//        }
//    }
}
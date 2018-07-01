package com.jianbo.original.home

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.design.widget.TabLayout
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import com.jianbo.original.R
import com.jianbo.original.splash.adapter.ViewPagerAdapter
import com.jianbo.toolkit.prompt.ToastUtils
import com.liang.jtablayout.Indicator
import com.liang.jtablayout.JIndicator
import com.liang.jtablayout.JTabLayout
import com.liang.jtablayout.NavigationMenu
import com.liang.jtablayout.listener.OnTabSelectedListener
import kotlinx.android.synthetic.main.activity_home.*
import java.util.*

class HomeActivity : AppCompatActivity() {

    private var list = ArrayList<View>()

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        navigationView.setIndicator(JIndicator())
//        navigationView.addTab(NavigationMenu.newInstance(this, "0001", android.R.drawable.ic_menu_camera))
//        navigationView.addTab(NavigationMenu.newInstance(this, "0002", android.R.drawable.ic_menu_share))
//        navigationView.addTab(NavigationMenu.newInstance(this, "0003", android.R.drawable.ic_menu_call))
//        navigationView.addTab(NavigationMenu.newInstance(this, "0004", android.R.drawable.ic_menu_camera))
//        navigationView.addTab(NavigationMenu.newInstance(this, "0005", android.R.drawable.ic_menu_agenda))
//        navigationView.addTab(NavigationMenu.newInstance(this, "0006", android.R.drawable.ic_menu_call))
//        navigationView.setCurrentTab(3)

        navigationView.setChangeListener(object : JTabLayout.OnTabListener {
            override fun onChanged(position: Int) {
                ToastUtils.showToast(this@HomeActivity, "navigationView onChanged: $position")
            }

            override fun onClick(position: Int) {
                ToastUtils.showToast(this@HomeActivity, "navigationView onClick: $position")
            }
        })

        button4.setOnClickListener {
            navigationView.setCurrentTab(1)
//            navigationView_top.setCurrentTab(1)
//            viewPager.currentItem = 3
        }

//        navigationView_top.setScroller(true)
//        var ind = JIndicator()
//        ind.setType(Indicator.TYPE_TRIANGLE)
//        ind.setHeight(30)
//        ind.setColor(ContextCompat.getColor(this, R.color.colorPrimary))
//////        ind.setGravity(Gravity.TOP)
//        navigationView_top.setIndicator(ind)
//        navigationView_top.setDividerWidth(30)
//        navigationView_top.setDividerHeight(50)
//
//        navigationView_top.addTab(NavigationMenu.newInstance(this, "0sasa00001", android.R.drawable.ic_menu_camera).setMode(Menu.MODE_HORIZONTAL))
//        navigationView_top.addTab(NavigationMenu.newInstance(this, "002", android.R.drawable.ic_menu_share).setMode(Menu.MODE_HORIZONTAL))
//        navigationView_top.addTab(NavigationMenu.newInstance(this, "00a6546403111", android.R.drawable.ic_menu_call).setMode(Menu.MODE_HORIZONTAL))
//        navigationView_top.addTab(NavigationMenu.newInstance(this, "0004", android.R.drawable.ic_menu_camera).setMode(Menu.MODE_HORIZONTAL))
//
//        navigationView_top.addTab(NavigationMenu.newInstance(this, "00sa0565464654564", android.R.drawable.ic_menu_call).setMode(Menu.MODE_HORIZONTAL))
//        navigationView_top.addTab(NavigationMenu.newInstance(this, "0006", android.R.drawable.ic_menu_agenda).setMode(Menu.MODE_HORIZONTAL))
//        navigationView_top.addTab(NavigationMenu.newInstance(this, "00s07444654564", android.R.drawable.ic_menu_camera).setMode(Menu.MODE_HORIZONTAL))
//
//
//        navigationView_top.setChangeListener(object : JTabLayout.OnTabListener {
//            override fun onChanged(position: Int) {
//                Toast.makeText(this@HomeActivity, "navigationView_top onChanged: $position", Toast.LENGTH_SHORT).show()
//            }
//
//            override fun onClick(position: Int) {
//                Toast.makeText(this@HomeActivity, "navigationView_top onClick: $position", Toast.LENGTH_SHORT).show()
//            }
//        })
        tabLayout.tabMode = TabLayout.MODE_FIXED
        tabLayout.setTabTextColors(Color.BLACK, Color.RED);
        navigationView_top.setTabTextColors(Color.BLACK, Color.RED);
        navigationView.setScroller(false)
        navigationView_top.setDividerWidth(5)
        for (i in 0 until 12) {
            list.add(layoutInflater.inflate(R.layout.flash_one, null))
            navigationView_top.addTab(navigationView_top.newTab().setTitle("Tab$i").setIcon(android.R.drawable.ic_menu_share).setIconColor(Color.BLACK, Color.RED))
            tabLayout.addTab(tabLayout.newTab().setText("Tab$i+10"))
            navigationView.addTab(NavigationMenu.newInstance(this, "Tab$i", android.R.drawable.ic_menu_camera))
            linearLayout.addView(navigationView_top.newTab().setTitle("Tab$i+10"), LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT, 1.0f))
        }
        navigationView_top.setMode(TabLayout.MODE_SCROLLABLE)
//        navigationView_top.addTab(navigationView_top.newTab().setTitle("Tab1"))
//        navigationView_top.addTab(navigationView_top.newTab().setTitle("Tab123123123"))
//        navigationView_top.addTab(navigationView_top.newTab().setTitle("Tab2"))
//        navigationView_top.addTab(navigationView_top.newTab().setTitle("Tab123123123"))
//        navigationView_top.addTab(navigationView_top.newTab().setTitle("Tab2"))
//        navigationView_top.addTab(navigationView_top.newTab().setTitle("Tab123123123"))
//        navigationView_top.addTab(navigationView_top.newTab().setTitle("Tab2"))
//        navigationView_top.addTab(navigationView_top.newTab().setTitle("Tab123123123"))
//        navigationView_top.addTab(navigationView_top.newTab().setTitle("Tab2"))
        var ind = JIndicator()
        ind.setType(JIndicator.TYPE_TRIANGLE)
//        ind.width = 40
        ind.height = 10
        ind.setRadius(5)
        ind.setColor(Color.GREEN)
        ind.isForeground = true
        ind.setTransitionScroll(true)
        navigationView_top.setIndicator(ind)

        tabLayout.addTab(tabLayout.newTab().setText("Tab1"))
        tabLayout.addTab(tabLayout.newTab().setText("Tab123123123"))
        tabLayout.addTab(tabLayout.newTab().setText("Tab2"))
        tabLayout.addTab(tabLayout.newTab().setText("Tab123123123"))
        tabLayout.addTab(tabLayout.newTab().setText("Tab2"))
        tabLayout.addTab(tabLayout.newTab().setText("Tab123123123"))
        tabLayout.addTab(tabLayout.newTab().setText("Tab2"))
        tabLayout.addTab(tabLayout.newTab().setText("Tab123123123"))
        tabLayout.addTab(tabLayout.newTab().setText("Tab2"))

        viewPager.adapter = ViewPagerAdapter(list)
//        navigationView.setViewPager(viewPager)
//        navigationView_top.setViewPager(viewPager)
        tabLayout.setupWithViewPager(viewPager)
        navigationView_top.setupWithViewPager(viewPager)


        navigationView_top.addOnTabSelectedListener(object : OnTabSelectedListener {
            override fun onTabUnselected(tab: Int) {
                Log.e("navigationView_top_OnTabSelectedListener", "onTabUnselected: ...$tab")
            }

            override fun onTabReselected(tab: Int) {
                Log.e("navigationView_top_OnTabSelectedListener", "onTabReselected: ...$tab")
            }

            override fun onTabSelected(tab: Int) {
                Log.e("navigationView_top_OnTabSelectedListener", "onTabSelected: ...$tab")
            }

        })
    }
}

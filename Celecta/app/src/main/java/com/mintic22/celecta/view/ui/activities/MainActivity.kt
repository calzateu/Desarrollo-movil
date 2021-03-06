package com.mintic22.celecta.view.ui.activities

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import android.os.Bundle
import android.widget.RelativeLayout
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.bottomnavigation.BottomNavigationItemView

import com.mintic22.celecta.view.ui.fragments.HomeFragment
import com.mintic22.celecta.view.ui.fragments.OrderFragment
import com.mintic22.celecta.view.ui.fragments.ComentsFragment
import com.mintic22.celecta.view.ui.fragments.AdminFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.mintic22.celecta.R
import com.mintic22.celecta.view.ui.ProductGridFragment
import com.mintic22.celecta.view.ui.fragments.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val homeFragment = HomeFragment()
    private val comeFragment = ComentsFragment()
    private val orderFragment = OrderFragment()
    private val commentsDetailDialogFragment = CommentsDetailDialogFragment()
    private val productGridFragment = ProductGridFragment()
    private val adminFragment = AdminFragment()
    private val orderDetailDialogFragment= OrderDetailDialogFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(homeFragment)

        nav_boto.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.navHomeFragment -> replaceFragment(homeFragment)
                R.id.navCommentsFragment -> replaceFragment(comeFragment)
                R.id.navOrderFragment -> replaceFragment(orderFragment)
                R.id.navAdminFragment -> replaceFragment(adminFragment)
            }
            true
        }
    }

    private fun replaceFragment(fragment:Fragment){
        if(fragment !=null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()
        }
    }

}

package com.tantan.timhore

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_menu.*

class menu : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var menu : Menu = navigationView.menu
        selectedMenu(menu.getItem(0))
        navigationView.setOnNavigationItemSelectedListener {
                item: MenuItem ->  selectedMenu(item)

            false
        }

    }

    private fun selectedMenu(item : MenuItem) {
        item.isChecked = true
        when(item.itemId) {
            R.id.nav_home -> selectedFragment(home_fragment.getInstance())
            R.id.nav_keranjang -> selectedFragment(keranjang_fragment.getInstance())
            R.id.nav_transaksi -> selectedFragment(transaksi_fragment.getInstance())
            R.id.nav_akun -> selectedFragment(akun_fragment.getInstance())
        }
    }

    fun selectedFragment(fragment: Fragment) {
        var transaction : FragmentTransaction? = supportFragmentManager.beginTransaction()
        transaction?.replace(R.id.container, fragment)
        transaction?.commit()
    }
}

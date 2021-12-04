package com.example.mycomposeapp

import android.os.Bundle
import com.example.mycomposeapp.LoginComposeFragment
import androidx.fragment.app.FragmentActivity

class MainDefActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportFragmentManager.beginTransaction()
            .replace(android.R.id.content, LoginComposeFragment())
            .commit()
    }
}
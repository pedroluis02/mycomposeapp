package com.example.mycomposeapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material.Text
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment

class FragmentWithCompose : Fragment (){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_wt_compose1, container, false).apply {
            findViewById<ComposeView>(R.id.composeView).setContent {
                Text(text = "Compose View area.")
            }
        }
    }
}
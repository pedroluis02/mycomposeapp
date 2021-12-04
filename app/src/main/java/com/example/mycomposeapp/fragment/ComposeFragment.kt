package com.example.mycomposeapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment

abstract class ComposeFragment : Fragment() {

    @Composable
    abstract fun BuildContent()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?  = ComposeView(requireContext()).apply {
        setContent { BuildContent() }
    }
}
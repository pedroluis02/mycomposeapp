package com.example.mycomposeapp

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import com.example.mycomposeapp.component.PasswordTextField
import com.example.mycomposeapp.fragment.ComposeFragment

class LoginComposeFragment : ComposeFragment() {
    @Composable
    override fun BuildContent() {
        Column {
            TextField(
                value = "",
                label = { Text("Enter Email") },
                onValueChange = { }
            )
            PasswordTextField(
                label = { Text("Enter password") },
                onValueChange = {
                }
            )
        }
    }
}

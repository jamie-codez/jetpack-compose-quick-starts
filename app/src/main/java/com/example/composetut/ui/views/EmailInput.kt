package com.example.composetut.ui.views

import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.composetut.vm.actions.AuthenticationEvent

@Composable
fun EmailInput(
    modifier: Modifier = Modifier,
    email: String?,
    onEmailChanged: (email: String) -> Unit
) {
    TextField(
        modifier = modifier,
        value = email ?: "",
        onValueChange = { onEmailChanged(it) })
}
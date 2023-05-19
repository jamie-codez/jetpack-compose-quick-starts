package com.example.composetut.vm.actions

sealed class AuthenticationEvent {
    object ToggleAuthenticationMode : AuthenticationEvent()
    class EmailChanged(val emailAddress: String) : AuthenticationEvent()
    class PasswordChanged(val password: String) : AuthenticationEvent()
    object Authenticate : AuthenticationEvent()
    object ErrorDismissed : AuthenticationEvent()
}

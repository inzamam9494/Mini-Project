package com.example.loginpage.user

data class AuthState(
    val email : String = "",
    val password : String = "",
    val confirmPassword: String = "",
    val userName: String = "",
    val department: String = "",
    val rollNumber: String = "",
    val enrollNo: String = ""
)
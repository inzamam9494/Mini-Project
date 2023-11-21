package com.example.loginpage.user

sealed class AuthEvent {
    data class Username(val username: String) : AuthEvent()
    data class Email(val email: String) : AuthEvent()
    data class Password(val password: String) : AuthEvent()
    data class Department(val department: String) : AuthEvent()
    data class RollNumber(val rollNumber: String) : AuthEvent()
    data class Enrollment(val enrollment: String) : AuthEvent()
    data class ConfirmPassword(val confirmPassword: String): AuthEvent()
}
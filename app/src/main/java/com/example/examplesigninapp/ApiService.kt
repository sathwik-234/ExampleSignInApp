package com.example.examplesigninapp


import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

data class SignInRequest(val email: String, val password: String)
data class SignInResponse(val token: String)

interface ApiService {
    @POST("auth/signin")
    suspend fun signIn(@Body request: SignInRequest): Response<SignInResponse>
}

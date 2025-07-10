package ni.sjar.smartsalessjar.features.login.data.remote

import ni.sjar.smartsalessjar.features.login.data.remote.model.LoginRequest
import ni.sjar.smartsalessjar.features.login.data.remote.model.LoginResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApi {
    @POST("auth/login")
    suspend fun login(@Body request: LoginRequest): LoginResponse
}
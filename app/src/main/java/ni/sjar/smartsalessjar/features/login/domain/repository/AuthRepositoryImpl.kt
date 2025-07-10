package ni.sjar.smartsalessjar.features.login.domain.repository

import ni.sjar.smartsalessjar.features.login.data.remote.AuthApi
import ni.sjar.smartsalessjar.features.login.data.remote.model.LoginRequest
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val api: AuthApi
) : AuthRepository {
    override suspend fun login(email: String, password: String) {
        api.login(LoginRequest(email, password))
    }
}
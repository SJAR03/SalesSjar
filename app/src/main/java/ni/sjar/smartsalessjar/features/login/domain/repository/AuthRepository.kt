package ni.sjar.smartsalessjar.features.login.domain.repository

interface AuthRepository {
    suspend fun login(email: String, password: String)
}
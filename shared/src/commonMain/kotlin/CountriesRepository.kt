import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.request
import io.ktor.serialization.kotlinx.json.json
import io.ktor.client.call.body
import io.ktor.client.request.get

class CountriesRepository {
    private val COUNTRIES_URL = "http://localhost:$SERVER_PORT"
   // private const val COUNTRIES_URL = "https://10.0.0.2:$SERVER_PORT"

    private val client = HttpClient{
        install(ContentNegotiation){
            json()
        }
    }
    suspend fun getCountries(): List<Country> =client.request(COUNTRIES_URL).body()
}
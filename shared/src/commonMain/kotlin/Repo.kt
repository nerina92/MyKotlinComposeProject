import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.request
import io.ktor.serialization.kotlinx.json.json

expect val COUNTRIES_URL: String// = "http://localhost:8080"
 class Repo(

   //val COUNTRIES_URL: String = "http://10.0.2.2:$SERVER_PORT"
){
    private val client = HttpClient{
        install(ContentNegotiation){
            json()
        }
    }

    suspend fun getCountries(): List<Country> =client.request(COUNTRIES_URL).body()

}

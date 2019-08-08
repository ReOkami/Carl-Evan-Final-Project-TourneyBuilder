package okami.yami.carl_finalproject_tourneybuilder

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface Endpoints {
    @GET("api/vi/participants")
    fun getPartciapantList(): Call<List<Participant>>

    @GET("api/v1/Participants/{ParticipantId")
    fun getParticioantByID(@Path("ParticipantId") ParticipantID: Int): Call<Participant>

    @GET("api/v1/Participants")
    fun getParticpantListRequireToken(@Header("x-api-key") key: String): Call<List<Participant>>
}
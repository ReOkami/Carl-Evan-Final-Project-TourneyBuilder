package okami.yami.carl_finalproject_tourneybuilder

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface Endpoints {
    @GET("Participants")
    fun getParticipantList(): Call<DataModel>

//    @GET("Participants/{ParticipantId")
//    fun getParticipantByID(@Path("ParticipantId") ParticipantID: Int): Call<Participant>
//
//    @GET("Participants")
//    fun getParticipantListRequireToken(@Header("x-api-key") key: String): Call<List<Participant>>
}
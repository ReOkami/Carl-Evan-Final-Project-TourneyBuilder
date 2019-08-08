package okami.yami.carl_finalproject_tourneybuilder

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetroFitInstance{
    val BASE_URL = "http://demo9671203.mockable.io/"

    private var INSTANCE: Retrofit? = null

    val retrofit: Retrofit

        get(){
            return INSTANCE ?: Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build().also { INSTANCE = it }

        }
}
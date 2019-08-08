package okami.yami.carl_finalproject_tourneybuilder

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class DataModels(

    @SerializedName("data")
    @Expose
    val `data`: List<Participant>,
    @SerializedName("Page")
    @Expose
    val page: Int,
    @SerializedName("perPage")
    @Expose
    val perPage: Int,
    @SerializedName("total")
    @Expose
    val total: Int,
    @SerializedName("totalPages")
    @Expose
    val totalPages: Int
)

data class Participant(
    @SerializedName("ID")
    @Expose
    val ID: Int,
    @SerializedName("name")
    @Expose
    val Name: String,
    @SerializedName("biography")
    @Expose
    val biography: String,
    @SerializedName("previousWins")
    @Expose
    val previousWins: Int,
    @SerializedName("tournamentName")
    @Expose
    val tournamentName: String
)
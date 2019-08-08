package okami.yami.carl_finalproject_tourneybuilder

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class DataModel(
    @SerializedName("data")
    @Expose
    val `data`: List<Participant>,
    @SerializedName("page")
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
    @SerializedName("biography")
    @Expose
    val biography: String,
    @SerializedName("id")
    @Expose
    val id: Int,
    @SerializedName("name")
    @Expose
    val name: String,
    @SerializedName("previousWins")
    @Expose
    val previousWins: Int,
    @SerializedName("tournamentName")
    @Expose
    val tournamentName: String
)
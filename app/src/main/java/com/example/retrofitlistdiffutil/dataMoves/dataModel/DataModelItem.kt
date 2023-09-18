package com.example.retrofitlistdiffutil.dataMoves.dataModel

import com.google.gson.annotations.SerializedName

data class DataModelItem(
    @SerializedName("Actors")
    val Actors: String?,
    @SerializedName("Awards")
    val Awards: String?,
    @SerializedName("Actors")
    val ComingSoon: Boolean?,
    @SerializedName("Country")
    val Country: String?,
    @SerializedName("Director")
    val Director: String?,
    @SerializedName("Genre")
    val Genre: String?,
    @SerializedName("Images")
    val Images: List<String>?,
    @SerializedName(" Language")
    val Language: String?,
    @SerializedName("Metascore")
    val Metascore: String?,
    @SerializedName("Plot")
    val Plot: String?,
    @SerializedName("Poster")
    val Poster: String?,
    @SerializedName("Rated")
    val Rated: String?,
    @SerializedName("Released")
    val Released: String?,
    @SerializedName("Response")
    val Response: String?,
    @SerializedName("Runtime")
    val Runtime: String?,
    @SerializedName("Title")
    val Title: String?,
    @SerializedName("Type")
    val Type: String?,
    @SerializedName("Writer")
    val Writer: String?,
    @SerializedName("Year")
    val Year: String?,
    @SerializedName("imdbID")
    val imdbID: String?,
    @SerializedName("imdbRating")
    val imdbRating: String?,
    @SerializedName("imdbVotes")
    val imdbVotes: String?,
    @SerializedName("totalSeasons")
    val totalSeasons: String?
)
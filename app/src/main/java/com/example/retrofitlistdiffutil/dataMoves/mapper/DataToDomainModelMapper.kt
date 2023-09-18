package com.example.retrofitlistdiffutil.dataMoves.mapper

import androidx.compose.ui.graphics.ImageBitmap
import com.example.retrofitlistdiffutil.dataMoves.dataModel.DataModelItem
import com.example.retrofitlistdiffutil.domainMoves.domainModel.DomainModelItems

class DataToDomainModelMapper:DataToDomain<DataModelItem,DomainModelItems> {
    override fun delegate(input: DataModelItem): DomainModelItems =
        DomainModelItems(Actors = input.Actors.orEmpty(),
        Awards = input.Awards.orEmpty(),
        ComingSoon = false,
        Country = input.Country.orEmpty(),
        Director = input.Director.orEmpty(),
        Genre = input.Genre.orEmpty(),
        Images = input.Images.orEmpty(),
            Language = input.Language.orEmpty(),
            Metascore = input.Metascore.orEmpty(),
            Plot = input.Plot.orEmpty(),
            Poster = input.Poster.orEmpty(),
            Rated = input.Rated.orEmpty(),
            Released = input.Released.orEmpty(),
            Response = input.Response.orEmpty(),
            Runtime = input.Runtime.orEmpty(),
            Title = input.Title.orEmpty(),
            Type = input.Type.orEmpty(),
            Writer = input.Writer.orEmpty(),
            Year = input.Year.orEmpty(),
            imdbID = input.imdbID.orEmpty(),
            imdbVotes = input.imdbVotes.orEmpty(),
            imdbRating = input.imdbRating.orEmpty(),
            totalSeasons = input.totalSeasons.orEmpty()
        )
}
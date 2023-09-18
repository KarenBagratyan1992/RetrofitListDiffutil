package com.example.retrofitlistdiffutil.dataMoves.dataSource.remotDataSource

import com.example.retrofitlistdiffutil.dataMoves.dataModel.DataModelItem
import retrofit2.http.GET

interface MoveApiService {
    @GET (MoveAppURL.ENDPOINT)
    suspend fun getMoveListDataModel():List<DataModelItem>


}
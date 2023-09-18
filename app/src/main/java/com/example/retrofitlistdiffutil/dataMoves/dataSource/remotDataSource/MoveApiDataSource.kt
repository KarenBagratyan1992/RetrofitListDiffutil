package com.example.retrofitlistdiffutil.dataMoves.dataSource.remotDataSource

import com.example.retrofitlistdiffutil.dataMoves.dataModel.DataModelItem

interface MoveApiDataSource {
    suspend fun getDataSourceModel():List<DataModelItem>
}
package com.example.retrofitlistdiffutil.dataMoves.dataSource.remotDataSource

import com.example.retrofitlistdiffutil.dataMoves.dataModel.DataModelItem

class MoveApiDataSourceImpl(private val service:MoveApiService):MoveApiDataSource {
    override suspend fun getDataSourceModel(): List<DataModelItem> =
        try {
            service.getMoveListDataModel()

        }catch(e:Exception){
            emptyList()
        }

}
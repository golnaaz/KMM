package com.golnaz.kmmapplication.shared

import com.golnaz.kmmapplication.shared.network.SpaceXApi

class SpaceXSDK() {
    private val api = SpaceXApi()

    @Throws(Exception::class) suspend fun getData(): Data{
      return  api.getAllData()
    }
}
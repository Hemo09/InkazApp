package com.elkfrawy.engaz.data.remote.car

import com.elkfrawy.engaz.domain.model.Car
import com.elkfrawy.engaz.domain.model.User
import com.elkfrawy.engaz.domain.util.Result

interface CarRemoteSource {

    suspend fun updateCarInfo(user_id: Long, name: String, car_model: Int,
                       car_number: Int, car_color: String,
                       car_license: String):Result<Unit>

    suspend fun getCar(user_id: Long): Result<List<Car>>

}
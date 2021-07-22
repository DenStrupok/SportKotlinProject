package com.example.sportkotlinproject.pojo

import android.os.Parcel
import android.os.Parcelable

open class FoodGroup(var nameFoodGroup: String, var imgFoodGroup: Int, var list: List<Dish>) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString().toString(),
            parcel.readInt(),
            TODO("list")) {
    }

    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        TODO("Not yet implemented")
    }

    companion object CREATOR : Parcelable.Creator<FoodGroup> {
        override fun createFromParcel(parcel: Parcel): FoodGroup {
            return FoodGroup(parcel)
        }

        override fun newArray(size: Int): Array<FoodGroup?> {
            return arrayOfNulls(size)
        }
    }
}
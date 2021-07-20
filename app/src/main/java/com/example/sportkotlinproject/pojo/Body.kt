package com.example.sportkotlinproject.pojo

import android.annotation.SuppressLint
import android.os.Parcel
import android.os.Parcelable

@SuppressLint("ParcelCreator")
class Body(val namePartBody: String, val imgPartBody: Int, val listExercise: List<Exercise>) :  Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString().toString(),
            parcel.readInt(),
            TODO("listExercise")) {
    }

    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        TODO("Not yet implemented")
    }

    companion object CREATOR : Parcelable.Creator<Body> {
        override fun createFromParcel(parcel: Parcel): Body {
            return Body(parcel)
        }

        override fun newArray(size: Int): Array<Body?> {
            return arrayOfNulls(size)
        }
    }
}
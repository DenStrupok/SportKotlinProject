package com.example.sportkotlinproject.pojo

class Exercise( val nameExercise: String, var isCheckedExercise: Boolean = false) {

    var setExercise: Int = 0
    var iterationExercise: Int = 0

    fun madeExercise( set: Int, iteration: Int): Int {
        return set * iteration
    }
    @JvmName("isCheckedExercise1")

    fun setCheckedExercise(boolean: Boolean){
            isCheckedExercise = boolean
    }

}
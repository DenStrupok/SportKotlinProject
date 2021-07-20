package com.example.sportkotlinproject.pojo

import com.example.sportkotlinproject.R


object BodyFactory {
    private var body: Body? = null

    fun createPartBody(namePartBody: String): Body? {
        if (namePartBody == "Back") {
            val nameBody = "Back"
            val imgBodyPart = R.drawable.icon_muscle_back

            val barbellPendlayRow = Exercise("Barbell Pendlay Row")
            val dumbbellLyingRearDeltRow = Exercise("Dumbbell Lying Rear Delt Row")
            val cableLowSeatedRow = Exercise("Cable Low Seated Row")
            val cablePulldown = Exercise("Cable Pulldown")
            val cableStraightBackSeatedRow = Exercise("Cable Straight Back Seated Row")

            val listExercise = mutableListOf(
                barbellPendlayRow, dumbbellLyingRearDeltRow,
                cableLowSeatedRow, cablePulldown, cableStraightBackSeatedRow
            )
            body = Body(nameBody, imgBodyPart, listExercise)
        }
        if (namePartBody == "Chest") {
            val nameBody = "Chest"
            val imgBodyPart = R.drawable.icon_muscle_chest

            val cableCrossoverVariation = Exercise("Cable Crossover Variation")
            val cableStandingFly = Exercise("Cable Standing Fly")
            val barbellBenchPress = Exercise("Barbell Bench Press")
            val dumbbellDeclineFly = Exercise("Dumbbell Decline Fly")
            val dumbbellInclineFly = Exercise("Dumbbell Incline Fly")
            val chestDip = Exercise("Chest Dip")
            val listExercise = mutableListOf(
                cableCrossoverVariation, cableStandingFly, barbellBenchPress,
                dumbbellDeclineFly, dumbbellInclineFly, chestDip
            )

            body = Body(nameBody, imgBodyPart, listExercise)
        }
        if (namePartBody == "Biceps") {
            val nameBody = "Biceps"
            val imgBody = R.drawable.icon_muscle_hands

            val barbellCurlBiceps = Exercise("Barbell Curl Biceps")
            val dumbbellAlternateBicepsCurl = Exercise("Dumbbell Alternate Biceps Curl")
            val dumbbellCrossBodyHammerCurlBiceps =
                Exercise("Dumbbell Cross Body Hammer Curl Biceps")
            val dumbbellKickback = Exercise("Dumbbell Kickback")
            val ezBarbellSpiderCurl = Exercise("EZ Barbell Spider Curl")
            val bandAlternatingBicepsCurl = Exercise("Band alternating biceps curl")

            val listExercise = mutableListOf(
                barbellCurlBiceps, dumbbellAlternateBicepsCurl, ezBarbellSpiderCurl,
                dumbbellCrossBodyHammerCurlBiceps, dumbbellKickback, bandAlternatingBicepsCurl
            )

            body = Body(nameBody, imgBody, listExercise)
        }
        if (namePartBody == "Triceps") {
            val name = "Triceps"
            val imgBody = R.drawable.icon_muscle_hands

            val barbellLyingTricepsExtension = Exercise("Barbell Lying Triceps Extension")
            val cablePushDownTriceps = Exercise("Cable Push Down Triceps")
            val leverSeatedDip = Exercise("Lever Seated Dip")
            val assistedTricepsDip = Exercise("Assisted Triceps Dip")
            val bandSideTricepsExtension = Exercise("Band side triceps extension")
            val ezBarCloseGripBenchPress = Exercise("EZ-bar Close Grip Bench Press")
            val listExercise = mutableListOf(barbellLyingTricepsExtension,
                cablePushDownTriceps,
                leverSeatedDip,
                assistedTricepsDip,
                bandSideTricepsExtension,
                ezBarCloseGripBenchPress)
            body = Body(name, imgBody, listExercise)
        }
        if (namePartBody == "Legs") {
            val nameBody = "Legs"
            val imgBody = R.drawable.icon_muscle_legs

            val dumbbellContralateralForwardLunge = Exercise("Dumbbell Contralateral Forward Lunge")
            val dumbbellStepUp = Exercise("Dumbbell Step up")
            val barbellFullSquat = Exercise("Barbell Full Squat")
            val leverLegExtension = Exercise("Lever Leg Extension")
            val leverLyingLegCurl = Exercise("Lever Lying Leg Curl")
            val leverAlternateLegPress = Exercise("Lever Alternate Leg Press")
            val listExercise = mutableListOf(
                dumbbellContralateralForwardLunge, dumbbellStepUp, barbellFullSquat,
                leverAlternateLegPress, leverLegExtension, leverLyingLegCurl
            )

            body = Body(nameBody, imgBody, listExercise)
        }
        if (namePartBody == "Press") {
            val nameBody = "Press"
            val imgBodyPart = R.drawable.icon_muscle_press

            val otisUp = Exercise("Otis Up")
            val weightedRussianTwist = Exercise("Weighted Russian Twist")
            val bridgeMountainClimber = Exercise("Bridge Mountain Climber")
            val captainsChairStraightLegRaise = Exercise("Captains Chair Straight Leg Raise")
            val elbowToKnee = Exercise("Elbow to Knee")
            val declineCrunch = Exercise("Decline Crunch")
            val listExercise = mutableListOf(
                otisUp, weightedRussianTwist, bridgeMountainClimber,
                captainsChairStraightLegRaise, elbowToKnee, declineCrunch
            )
            body = Body(nameBody, imgBodyPart, listExercise)
        }
        if (namePartBody == "Shoulders") {
            val nameBody = "Shoulders"
            val imgBodyPart = R.drawable.icon_muscle_shoulders

            val dumbbellArnoldPress = Exercise("Dumbbell Arnold Press")
            val dumbbellCubanPress = Exercise("Dumbbell Cuban Press")
            val dumbbellFrontRaise = Exercise("Dumbbell Front Raise")
            val cableFrontShoulderRaise = Exercise("Cable Front Shoulder Raise")
            val leverSeatedReverseFly = Exercise("Lever Seated Reverse Fly")
            val leverMilitaryPress = Exercise("Lever Military Press")
            val listExercise = mutableListOf(
                dumbbellArnoldPress, dumbbellCubanPress, dumbbellFrontRaise,
                cableFrontShoulderRaise, leverSeatedReverseFly, leverMilitaryPress
            )
            body = Body(nameBody, imgBodyPart, listExercise)
        }
        if (namePartBody == "Cardio") {
            val nameBody = "Cardio"
            val imgPartBody = R.drawable.ic_muscle_cardio

            val run = Exercise("Run")
            val driveBike = Exercise("Drive on bike")
            val walk = Exercise("Walk")
            val doubleUnderJumpRope = Exercise("Double Under Jump Rope")
            val listExercise = mutableListOf(run, driveBike, walk, doubleUnderJumpRope)

            body = Body(nameBody, imgPartBody, listExercise)
        }
        return body
    }
}
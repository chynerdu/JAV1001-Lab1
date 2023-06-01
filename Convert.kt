

import kotlin.text.toLowerCase
fun main() {
    // Define values for base units
    val kMTOMI = 0.62
    val mITOKM = 1.61
    val cMTOINCH = 0.39
    val iNCHTOCM = 2.54
    val kGTOLB = 2.2
    val lBTOKG = 0.45
    val gTOOZ = 0.04
    val oZTOG = 28.35

    // Intro message
    println("Enter measurement unit (km, mi, cm, inch, lib, kg, ox, gram)")
    try {
        // Read measurement unit from the terminal
        val measurementUnit = readLine()
        val formattedMeasurementUnit = measurementUnit
        println("Enter value to convert")
        var value = readLine()!!.toDouble()

        // Convert values and print result
        fun convertValues(baseUnit: String, baseValue: Double) {
            var result: Double = value * baseValue
            println("$value$formattedMeasurementUnit is $result in $baseUnit")
        }

        // calls convertions with parameters based on measurement unit
        when (formattedMeasurementUnit?.toLowerCase()) {
            "km" -> convertValues("Mi", kMTOMI)

            "mi" -> convertValues("Km", mITOKM)

            "cm" -> convertValues("Inch", cMTOINCH)

            "inch" -> convertValues("Cm", iNCHTOCM)

            "lib" -> convertValues("Kg", lBTOKG)

            "kg" -> convertValues("Li", kGTOLB)

            "ox" -> convertValues("G", oZTOG)

            "gram" -> convertValues("Oz", gTOOZ)

            else -> {
                println("specified unit not found")
                return
            }
        }
    } catch (e: NumberFormatException) {
        println("You entered an invalid value")
    }
}

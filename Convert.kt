

fun main() {
    val kmToMi = 0.62
    val miToKm = 1.61
    val cmToInch = 0.39
    val inchToCm = 2.54
    val kgToLb = 2.2
    val lbToKg = 0.45
    val gToOz = 0.04
    val ozToG = 28.35

    println("hello there")
    println("Enter unit to convert to (km or Mi)")
    val measurementUnit = readLine()
    val formattedMeasurementUnit = measurementUnit
    println("Enter value to convert")
    var value = readLine()!!.toDouble()
    var result = 0.0
    when (formattedMeasurementUnit) {
        "km" -> result = value * miToKm
        "mi" -> result = value * kmToMi
        "cm" -> result = value * inchToCm
        "inch" -> result = value * cmToInch
        "lib" -> result = value * kgToLb
        "kg" -> result = value * lbToKg
        "ox" -> result = value * gToOz
        "gram" -> result = value * ozToG

        else -> println("specified unit not found")
    }
}

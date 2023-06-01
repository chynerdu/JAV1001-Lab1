

import kotlin.text.toLowerCase

enum class BASEUNITS(val value: Double) {
    KMTOMI(0.62),
    MITOKM(1.61),
    CMTOINCH(0.39),
    INCHTOCM(2.54),
    KGTOLB(2.2),
    LBTOKG(0.45),
    GTOOZ(0.04),
    OZTOG(28.35),
}
fun main() {
    println("Enter measurement unit (km, mi, cm, inch, lib, kg, ox, gram)")
    val measurementUnit = readLine()
    val formattedMeasurementUnit = measurementUnit
    println("Enter value to convert")
    var value = readLine()!!.toDouble()

    fun convertValues(baseUnit: String, baseValue: Double) {
        var result: Double = value * baseValue
        println("$value in $formattedMeasurementUnit is $result in $baseUnit")
    }

    when (formattedMeasurementUnit?.toLowerCase()) {
        "km" -> convertValues("Mi", BASEUNITS.KMTOMI.value)

        "mi" -> convertValues("Km", BASEUNITS.MITOKM.value)

        "cm" -> convertValues("Inch", BASEUNITS.CMTOINCH.value)

        "inch" -> convertValues("Cm", BASEUNITS.INCHTOCM.value)

        "lib" -> convertValues("Kg", BASEUNITS.LBTOKG.value)

        "kg" -> convertValues("Li", BASEUNITS.KGTOLB.value)

        "ox" -> convertValues("G", BASEUNITS.OZTOG.value)

        "gram" -> convertValues("Oz", BASEUNITS.GTOOZ.value)

        else -> {
            println("specified unit not found")
            return
        }
    }
}

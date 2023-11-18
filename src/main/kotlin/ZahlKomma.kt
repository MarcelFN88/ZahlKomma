import java.text.NumberFormat
import java.util.Locale
import kotlin.math.*

fun main() {
    val f1 = 2.375f
    val f2: Float = 1.0f / 7.0f
    println("Float: $f1 $f2")
    println("Grenzen: ${Float.MAX_VALUE} ${Float.MIN_VALUE}\n")

    val d1 = 2.375
    val d2: Double = 1.0 / 7.0
    println("Double: $d1 $d2")
    println("Grenzen: ${Double.MAX_VALUE} ${Double.MIN_VALUE}\n")

    val e1 = 1.5e9
    val e2 = 1.5e-9
    println("Exponential: $e1 $e2\n")

    val nfg = NumberFormat.getInstance()
    nfg.maximumFractionDigits = 3
    println("DE-Format: " + nfg.format(d2))

    val nfu = NumberFormat.getInstance(Locale.US)
    nfu.maximumFractionDigits = 3
    println("US-Format: " + nfu.format(d2))

    println("Runden:   " + round(d2 * 1e3) / 1e3)
}
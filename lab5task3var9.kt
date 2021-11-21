import kotlin.math.*

fun main() {
    val (a,b,h) = readInputData2()
    tabulation2(a,b,h)
}

fun readInputData2(): Triple<Double, Double, Double> {
    val a = readLine()!!.toDouble()
    val b = readLine()!!.toDouble()
    val h = readLine()!!.toDouble()
    return Triple(a,b,h)
}

fun tabulation2(a: Double, b:Double, h:Double) {
    var i = a

    var arrayOfY = mutableListOf<Double>();
    var arrayOfX = mutableListOf<Double>();

    while( i <= b ){;
        var result = ln(i - 0.5)/ sqrt(i);
        arrayOfY.add(result);
        arrayOfX.add(i);
        i += h;
    }

    var yMax = arrayOfY.maxOrNull();
    var yMin = arrayOfY.minOrNull();

    var yMaxIndex = arrayOfY.indexOf(yMax)
    var yMinIndex = arrayOfY.indexOf(yMin)

    var maxX = arrayOfX.elementAt(yMaxIndex)
    var minX = arrayOfX.elementAt(yMinIndex)

    println("yMin = $yMin при x = $minX")
    println("yMax = $yMax при x = $maxX")
}
import kotlin.math.*
import kotlin.math.pow


fun main() {
// 2.9

//    try {
//        println("Введите первое число")
//        var a = readLine()!!.toInt()
//        println("Введите второе число")
//        var b = readLine()!!.toInt()
//        println("Введите третье число")
//        var c = readLine()!!.toInt()
//      when
//      {
//          (a >= 1) && (a <= 3) -> println(a)
//      }
//        when
//        {
//            (b >= 1) && (b <= 3) -> println(b)
//        }
//        when
//        {
//            (c >= 1) && (c <= 3) -> println(c)
//        }
//    }
//    catch (e:Exception)
//    {
//        println("Введенное число неверно")
//    }

// 2.19

//    try {
//        println("Введите первое число")
//        var a = readLine()!!.toInt()
//        println("Введите второе число")
//        var b = readLine()!!.toInt()
//        println("Введите третье число")
//        var c = readLine()!!.toInt()
//      when
//      {
//          (abs(a) > abs(b) && abs(b) > abs(c)) -> println("${a}, ${b}, ${c}")
//          (abs(a) > abs(c) && abs(c) > abs(b)) -> println("${a}, ${c}, ${b}")
//          (abs(b) > abs(a) && abs(a) > abs(c)) -> println("${b}, ${a}, ${c}")
//          (abs(b) > abs(c) && abs(c) > abs(a)) -> println("${b}, ${c}, ${a}")
//          (abs(c) > abs(a) && abs(a) > abs(b)) -> println("${c}, ${a}, ${b}")
//          (abs(c) > abs(b) && abs(b) > abs(a)) -> println("${c}, ${b}, ${a}")
//      }
//    }
//    catch (e:Exception)
//    {
//        println("Введенное число неверно")
//    }

// 2.29

//    try {
//        var n:Int
//        do
//        {
//        println("Введите год")
//        n = readLine()!!.toInt()
//        } while (n < 1000 || n > 9999)
//        var temp = n % 100
//        if (!(n % 100 == 0) && temp % 4 == 0)
//            {
//            println("Год является високосным")
//        }
//        else if (n % 100 == 0 && n % 400 == 0)
//                {
//                    println("Год является високосным")
//                }
//        else
//        {
//            println("Год не является високосным")
//        }
//    }
//    catch (e:Exception)
//    {
//        println("Введенное число неверно")
//    }

// 2.39

//    try {
//            println("Введите коэффициент k для прямой y = kx + b")
//            var k = readLine()!!.toDouble()
//            println("Введите коэффициент b для прямой y = kx + b")
//            var b = readLine()!!.toDouble()
//            println("Введите коэффициент c для параболы y = cx^2 + dx + e")
//            var c = readLine()!!.toDouble()
//            println("Введите коэффициент d для параболы y = cx^2 + dx + e")
//            var d = readLine()!!.toDouble()
//            println("Введите коэффициент e для параболы y = cx^2 + dx + e")
//            var e = readLine()!!.toDouble()
//        var temp1 = d - k
//        var temp2 = e - b
//        var dis = temp1 * temp1 - 4 * c * temp2
//        if (dis >= 0) {
//            if (!(dis == 0.0))
//            {
//                var x1 = (-temp1 + sqrt(dis)) / 2 * c
//                var y1 = c * x1 * x1 + d * x1 + e
//                var x2 = (-temp1 - sqrt(dis)) / 2 * c
//                var y2 = c * x1 * x1 + d * x1 + e
//                println("Первая точка ${x1}, ${y1}")
//                println("Расстояние до начала координат ${sqrt(x1*x1 + y1*y1)}")
//                println("Вторая точка ${x1}, ${y1}")
//                println("Расстояние до начала координат ${sqrt(x2*x2 + y2*y2)}")
//            }
//            else
//            {
//                var x1 = -(temp1 / 2 * c)
//                var y1 = c * x1 * x1 + d * x1 + e
//                println("Одна точка пересечения ${x1}, ${y1}")
//                println("Расстояние до начала координат ${sqrt(x1*x1 + y1*y1)}")
//            }
//        }
//            else
//                println("Решений нет")
//    }
//    catch (e:Exception)
//    {
//        println("Введенное число неверно")
//    }

// 2.18

    var a:Int
    var b:Int
    var x:Int
    var y:Int
    var z:Int
        try {
            do {
                println("Введите ширину отверстия")
                a = readLine()!!.toInt()
                println("Введите высоту отверстия")
                b = readLine()!!.toInt()
                println("Введите введите длину кирпича")
                x = readLine()!!.toInt()
                println("Введите введите высоту кирпича")
                y = readLine()!!.toInt()
                println("Введите введите ширину кирпича")
                z = readLine()!!.toInt()
            } while (a <= 0 || b <= 0 || x <= 0 || y <= 0 || z <= 0)
      when
      {
          (a > x && b > y) || (a > y && b > z) || (a > z && b > x) -> println("Кирпич проходит")
          else -> println("Кирпич не проходит")
      }
    }
    catch (e:Exception)
    {
        println("Введенное число неверно")
    }
}
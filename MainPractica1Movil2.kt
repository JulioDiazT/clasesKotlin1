fun main(args: Array<String>) {
    println("Práctica 1")

    var opcion: Int
    do {
        println("Seleccione el número de ejercicio que desea ejecutar:")
        println("1. Números pares e impares")
        println("2. Calculadora simple")
        println("3. Números primos")
        println("4. Tabla de multiplicar")
        println("5. Factorial de un número")
        println("6. Suma de números pares")
        println("7. Serie Fibonacci")
        println("8. Números primos en un rango")

        val entrada = readLine()
        opcion = entrada?.toIntOrNull() ?: 0



        when (opcion) {
            1 -> ejercicioNumerosParesImpares()
            2 -> ejercicioCalculadoraSimple()
            3 -> ejercicioNumeroPrimos()
            4 -> ejercicioTablaMultiplicar()
            5 -> ejerciciofactorialDeUnNumero()
            6 -> ejercicioSumaDePares()
            7 -> ejercicioFibonacci()
            8 -> ejercicioNumPrimosRangp()

            else -> println("Opción inválida")
        }
        println("Presione Enter para volver al índice de ejercicios o ingrese 0 para salir ")
        readLine()
    } while (opcion != 0
    )
}

fun ejercicioNumerosParesImpares() {
    println("Ingrese un numero entero")
    val numero = readLine()?.toIntOrNull()

    if (numero != null) {
        println("Números pares desde el 2 hasta $numero:")
        for (i in 2..numero step 2) {
            println(i)
        }
        println("Números impares desde el 1 hasta $numero:")
        for (i in 1..numero step 2) {
            println(i)
        }
    } else {
        println("Número inválido. Por favor ingrese un numero entero valido ")
    }
}

fun ejercicioCalculadoraSimple() {

    println("Ingrese el primer numero")
    val num1 = readLine()?.toIntOrNull()
    println("Ingrese el segundo numero")
    val num2 = readLine()?.toIntOrNull()
    println("Ingrese un operador")
    val operador = readLine()
    var resultado = 0

    if (num1 != null && num2 != null && operador != null) {
        when (operador) {
            "+" -> resultado = (num1 + num2)
            "-" -> resultado = (num1 - num2)
            "*" -> resultado = (num1 * num2)
            "/" -> resultado = (num1 / num2)
        }
        println("El resultado es: $resultado")
    }
}

fun ejercicioNumeroPrimos() {

    println("Ingrese un número entero")
    val numero = readLine()?.toIntOrNull()

    if (numero != null && numero > 1) {
        if (numero < 2) {
            println("El número NO es primo")
        }
        for (i in 2 until numero) {
            if (numero % i == 0) {
                println("El número NO es primo")
            }
        }
        println("El número SI es primo")
    }
}

fun ejercicioTablaMultiplicar() {
    println("Ingrese un número entero:")
    val numero = readLine()?.toIntOrNull()

    if (numero != null) {
        println("Tabla de multiplicar del $numero:")
        for (i in 1..10) {
            val resultado = numero * i
            println("$numero x $i = $resultado")
        }
    } else {
        println("Número inválido")
    }
}

fun ejerciciofactorialDeUnNumero() {
    println("Ingrese un número entero:")
    val numero = readLine()?.toIntOrNull()
    if (numero != null && numero >= 0) {
        var resultado = 1
        for (i in 1..numero) {
            resultado *= i
        }
        println("$numero! = $resultado")
    } else {
        println("Ingresaste un valor inválido ")
    }
}

fun ejercicioSumaDePares() {
    println("Ingrese un número entero:")
    val numero = readLine()?.toIntOrNull()
    if (numero != null && numero > 0) {
        var suma = 0
        for (i in 1..numero) {
            if (i % 2 == 0) {
                suma += i
            }
        }
        println("La suma de los número pares de $numero es: $suma")
    } else println("Número inválido")
}

fun ejercicioFibonacci() {
    println("Ingresa la cantidad de npumero de la serie Fibonacci que deseas calcular ")
    val numero = readLine()?.toIntOrNull()

    if (numero != null && numero > 0) {
        println("Los primero $numero numeros de la serie Fibonacci son:")
        var num1 = 0
        var num2 = 1

        for (i in 1..numero) {
            println(num2)

            val suma = num1 + num2
            num1 = num2
            num2 = suma
        }
    } else {
        println("Ingresa un nùmero vàlido")
    }
}

fun ejercicioNumPrimosRangp() {
    println("Ingresa el comienzo del rango ")
    val num1 = readLine()?.toIntOrNull()
    println("Ingresa el fin del rango ")
    val num2 = readLine()?.toIntOrNull()

    if(num1 != null && num2 !=null && num2>num1 ){
        println("Los números primos en el rango de $num1 a $num2 son:")
        for (num in num1..num2){
            var esPrimo = true

            if( num > 1){
                for (i in 2 until num){
                    if( num % i ==0){
                        esPrimo=false
                        break
                    }
                }
            } else {
                esPrimo=false
            }

           if (esPrimo){
               println(num)
           }
        }
    }


}
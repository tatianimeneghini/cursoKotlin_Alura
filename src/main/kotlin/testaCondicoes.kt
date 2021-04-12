fun testaCondicoes(saldo: Double) { //function
    if (saldo > 0.0) {
        println("Saldo positivo");
    } else if (saldo == 0.0) {
        println("Saldo neutro");
    } else {
        println("Saldo negativo");
    }

    when { //substitui o if e else if
        saldo > 0.0 -> println("Saldo positivo");
        saldo == 0.0 -> println("Saldo neutro");
        else -> println("Saldo negativo");
    }
}
fun testaLacos() {
    var i = 0;
    while (i < 4) {
        val titular: String = "Alex $i";
        val numeroConta: Int = 1000 + i;
        var saldo: Double = 10.0 + i;

        println("Titular $titular");
        println("Conta: $numeroConta");
        println("Saldo: $saldo");
        println();
        i++;
    }
}
//fun main() {
//        println("Bem vinde ao Bytebank!");
//        //ctrl + alt + l para reformatar
//
//        //Instanciar um novo objeto
//        val contaAlex = Conta(titular = "Alex", numero = 1000);
//        contaAlex.saldo = 300.0;
//        //contaAlex.setSaldo(300.0);
//
//        val contaFran = Conta(titular = "Fran", numero = 1001);
//        contaFran.saldo = 1000.30;
//
////    println(contaFran.getSaldo());
////    println("Depositando na conta ${contaAlex.titular}");
//        contaAlex.depositar(contaAlex, 50.0);
//        contaAlex.sacar(100.0);
//    }
//
//    class Conta(
//        var titular: String,
//        val numero: Int
//    ) { // construtor primário que inicializa
//        //    var titular = titular;
////    var numero = numero;
//        var saldo: Double = 0.0;
//        //private var saldo: Double = 0.0; //acesso somente dentro da classe
//        // Modificar comportamento das propriedades: private set
//
////    constructor(titular: String, numero: Int) {
////        this.titular = titular;
////        this.numero = numero;
////    }
//
//        //Comportamentos de uma classe
//        fun depositar(conta: Conta, valor: Double) {
//            this.saldo += valor;
//            println("Valor depositado na conta de $titular: $saldo");
//        }
//
//        fun sacar(valor: Double) {
//            if (saldo >= valor) {
//                saldo -= valor;
//                println("Saque no valor de $valor com saldo total de $saldo");
//            } else {
//                println("Saldo insuficiente para saque");
//            }
//        }
//
//        fun transferir(valor: Double, destino: Conta): Boolean {
//            if (saldo >= valor) {
//                saldo -= valor;
//                destino.saldo += valor;
//                return true;
//            } else
//                println("Saldo insuficiente para transferência");
//            return false;
//        }
//
//        // Encapsulamento
////    fun getSaldo(): Double {
////        return saldo;
////    }
////
////    fun setSaldo(valor: Double) {
////        if (valor > 0) {
////            saldo = valor;
////        }
////    }
//    }
//
//    fun testaLacos() {
////        for (i in 1..4) { //incremento
////            val titular: String = "Alex $i";
////            val numeroConta: Int = 1000 + i; //constante
////            var saldo: Double = 10.0 + i; //variável
////            //saldo = 100 + 2.00; //double
////
////            println("Titular $titular");
////            println("Conta: $numeroConta");
////            println("Saldo: $saldo");
////            println(); //printa e pula próxima linha
////        }
//
//        var i = 0;
//        while (i < 4) {
//            val titular: String = "Alex $i";
//            val numeroConta: Int = 1000 + i;
//            var saldo: Double = 10.0 + i;
//
//            println("Titular $titular");
//            println("Conta: $numeroConta");
//            println("Saldo: $saldo");
//            println();
//            i++;
//        }
//    }
//
//    fun testaCondicoes(saldo: Double) { //function
////    if (saldo > 0.0) {
////        println("Saldo positivo");
////    } else if (saldo == 0.0) {
////        println("Saldo neutro");
////    } else {
////        println("Saldo negativo");
////    }
//        when { //substitui o if e else if
//            saldo > 0.0 -> println("Saldo positivo");
//            saldo == 0.0 -> println("Saldo neutro");
//            else -> println("Saldo negativo");
//        }
//    }
import sun.nio.cs.US_ASCII;

import java.util.Locale;
import java.util.Scanner;

class ContaTerminal {
    public static void main(String[] args) {


        //TODO: "conhecer e importar a classe scanner"
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


            //TODO:Exibir as Mensagens para solicitar os dados do usuarios.
        System.out.println("Por favor Digite seu nome");
            //TODO:"Armazenar os dados digitadors"
        String nome = scanner.next();

            //TODO:Exibir as Mensagens para solicitar os dados do usuarios.
        System.out.println("Por favor Digite sua Agência ");
            //TODO:"Armazenar os dados digitadors"
        String agencia = scanner.next();

            //TODO:Exibir as Mensagens para solicitar os dados do usuarios.
        System.out.println("Por favor Digite sua conta");
        //TODO:"Armazenar os dados digitadors"
        int conta = Integer.parseInt(scanner.next());

        double saldo = 1237.48;

        System.out.println("Por Favor, Digite o Valor que deseja sacar: ");
        double saque = Double.parseDouble(scanner.next());

double novoSaldo = saldo - saque;

//TODO:"Exibindo as Mensagens finais"
        System.out.println("Olá " + nome+"." + " Obrigado por ser correntista em nosso banco, sua Agência é: " + agencia +", "+ "conta: "+ conta +", " +
                "e seu Saldo era de R$ " + saldo + ". e após o saque realizado seu Saldo é: " + novoSaldo +" e já esta disponivel para saque.");



    }


}
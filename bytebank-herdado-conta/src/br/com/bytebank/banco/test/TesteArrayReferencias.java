package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

    public static void main(String[] args) {
        
        Conta[] contas = new Conta[10];

        ContaCorrente cc1 = new ContaCorrente(111, 345);
        contas[0] = cc1;

        ContaCorrente cc2 = new ContaCorrente(42, 777);
        contas[1] = cc2;

        ContaPoupanca cp1 = new ContaPoupanca(555, 2233);
        contas[2] = cp1;

        ContaPoupanca ref = (ContaPoupanca) contas[2];

        for (Conta conta : contas) {
            System.out.println(conta);
        }

    }
    
}

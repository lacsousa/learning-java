package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestePackUtil {

    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc1 = new ContaCorrente(111, 345);
        lista.add(cc1);

        Conta cc2 = new ContaCorrente(42, 777);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(321, 555);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(678, 888);
        lista.add(cc4);

        for( int i=0; i< lista.size(); i++ ) {

            System.out.println(lista.get(i));
        }
        
        System.out.println("-------------");

        for (Conta c: lista) {
            System.out.println(c);
        }
    }
}

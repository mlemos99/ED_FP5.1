/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_fp_054;

import ed_fp_053.*;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Utilizador
 */
public class Double {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int teste;

        System.out.printf("Informe o número do teste: ");
        teste = ler.nextInt();

        UnorderedList<String> lista1 = new UnorderedList<>();

        switch (teste) {
            case 0: //teste de ordenar alguns elementos
                lista1.addToFront("D");
                lista1.addToRear("B");
                lista1.addToFront("A");
                lista1.addAfter("C","B");
                System.out.println(lista1.toString());
//                Iterator it = lista1.iterator();
//
//                while (it.hasNext()) {
//                    String obj = (String) it.next();
//                    System.out.println(obj);
//                }

                break;

            case 1: //teste de ordenar com todos os elemtos do array ocupados
                lista1.addToFront("D");
                lista1.addToFront("B");
                lista1.addToFront("A");
                lista1.addToFront("C");

                Iterator it2 = lista1.iterator();

                while (it2.hasNext()) {
                    String obj = (String) it2.next();
                    System.out.println(obj);
                }
                break;

            case 2: //teste de ordenar com todos os elemtos do array ocupados mais um para fazer expandCapacity do array
                lista1.addToFront("D");
                lista1.addToFront("B");
                lista1.addToFront("A");
                lista1.addToFront("C");

                Iterator it3 = lista1.iterator();

                while (it3.hasNext()) {
                    String obj = (String) it3.next();
                    System.out.println(obj);
                }
                break;
        }
    }
}

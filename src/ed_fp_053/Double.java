/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_fp_053;

import ed_fp_05.OrderedList;
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
        
        OrderDoubleLikeList<String> lista1 = new OrderDoubleLikeList<>();

        switch (teste) {
            case 0: //teste de ordenar alguns elementos
                lista1.add("D");
                lista1.add("B");
                lista1.add("A");
                lista1.add("C");
                System.out.println(lista1.toString());
//                Iterator it = lista1.iterator();
//
//                while (it.hasNext()) {
//                    String obj = (String) it.next();
//                    System.out.println(obj);
//                }

                break;

            case 1: //teste de ordenar com todos os elemtos do array ocupados
                lista1.add("D");
                lista1.add("B");
                lista1.add("A");
                lista1.add("C");
                lista1.add("E");

                Iterator it2 = lista1.iterator();

                while (it2.hasNext()) {
                    String obj = (String) it2.next();
                    System.out.println(obj);
                }
                break;

            case 2: //teste de ordenar com todos os elemtos do array ocupados mais um para fazer expandCapacity do array
                lista1.add("D");
                lista1.add("B");
                lista1.add("A");
                lista1.add("C");
                lista1.add("E");
                lista1.add("G");
                lista1.add("F");

                Iterator it3 = lista1.iterator();

                while (it3.hasNext()) {
                    String obj = (String) it3.next();
                    System.out.println(obj);
                }
                break;
        }
    }
    }
    



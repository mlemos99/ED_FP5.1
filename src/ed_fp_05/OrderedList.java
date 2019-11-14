/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_fp_05;

import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Utilizador
 */
public class OrderedList<T> extends ArrayList<T>  implements OrderedListADT<T> {

    public OrderedList(int tam) {
        super(tam);
    }

    public OrderedList() {
    }
    
    @Override
    public void add(T element) {
       //cast
        if (element instanceof Comparable) {
            Comparable<T> elementocomparable = (Comparable<T>) element;
            
            if(this.rear == this.list.length){
                this.expandCapacity();
        }

            //meter no inicio sem nada
            if (this.isEmpty()) {
                this.list[this.rear] = element;
                this.rear++;
                return;
            }
            //meter a meio de cenas
            if (!this.isEmpty()) {
                for (int i = 0; i < this.rear; i++) {
                    if (elementocomparable.compareTo(this.list[i]) < 0) {
                        for (int j = this.rear - 1; j >= i; j--) {
                            list[j + 1] = list[j];
                        }
                        list[i] = element;
                        this.rear++;
                        return;
                    }
                }
            }

            //meter no fim
            list[this.rear] = element;
            this.rear++;
        }else{
            try {
                throw new NonComparableExcep();
            } catch (NonComparableExcep ex) {
                Logger.getLogger(OrderedList.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    

   
    
}

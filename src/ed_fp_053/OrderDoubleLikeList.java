/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_fp_053;

/**
 *
 * @author Utilizador
 */
public class OrderDoubleLikeList<T> extends DoubleList<T> implements OrderedListADT<T>{

    public OrderDoubleLikeList() {
    }
    

    @Override
    public void add(T element) {
        if(element instanceof Comparable){
            Comparable<T> elementocomparable = (Comparable<T>) element;
        }
        NodeD<T> current=new NodeD<T> (element);
        if(this.isEmpty()){
            current.setNext(head);
            current.setLast(current);
            head=current;
            
        }
        if()
        
        
        
        
        
    }
    
}

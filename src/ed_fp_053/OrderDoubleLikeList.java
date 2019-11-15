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
public class OrderDoubleLikeList<T> extends DoubleList<T> implements OrderedListADT<T> {

    public OrderDoubleLikeList() {
    }

    @Override
    public void add(T element) {
        NodeD<T> current = head;
        NodeD newNode = new NodeD(element);
        if (element instanceof Comparable) {
            Comparable<T> elemento = (Comparable<T>) element;

            if (this.isEmpty()) {
                head=newNode;
                tail=head;
                this.count++;
                return;

            }

            //insere a cabeça
            
                if (elemento.compareTo(head.getElemento()) < 0) {
                    newNode.setNext(head);
                    head.setLast(newNode);
                    head = newNode;
                    this.count++;
                    return;
                   

                }
                //inserir a cauda
                if(elemento.compareTo(tail.getElemento())>0){
                    tail.setNext(newNode);
                    newNode.setLast(tail);
                    tail=newNode;
                    this.count++;
                    return;
                    
                }
                while(current.getNext()!=null && elemento.compareTo(current.getElemento())>0){
                    current=current.getNext();
                }
                
                newNode.setLast(current.getLast());
                current.setLast(newNode);
                newNode.setNext(current);
                newNode.getLast().setNext(newNode);
                
                this.count++;
                return;
            
        }

    }

}

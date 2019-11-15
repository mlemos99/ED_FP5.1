/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_fp_054;

/**
 *
 * @author Utilizador
 */
public class UnorderedList<T> extends DoubleList<T> implements UnorderedListADT<T> {

    @Override
    public void addToFront(T element) {
        NodeD<T> nova = new NodeD<>(element);

        if (isEmpty()) {
            addToRear(element);

        } else {
            NodeD<T> current = head;
            NodeD<T> anterior = null;
            while (current.getNext() != null) {
                current = current.getNext();

            }
            //liga o novo nó a lista
            current.setNext(nova);
            nova.setLast(current);
            current = nova;
        }
        this.count++;

    }

    @Override
    public void addToRear(T element) {
        NodeD<T> nova = new NodeD<>(element);

        if (isEmpty()) {
            head = nova;

        } else {
            //liga o novo nó a lista
            nova.setNext(head);
            head.setLast(nova);
            head = nova;

        }
        this.count++;
    }

    @Override
    public void addAfter(T element, T atual) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

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
        NodeD<T> aux = head;
        NodeD<T> temp = new NodeD<T>();
        while (aux.getNext() != null) {
            if (aux.getElemento().equals(atual)) {
                temp.setLast(aux);
                temp.setNext(aux.getNext());
                temp.setElemento(element);
                aux.getNext().setLast(temp);
                aux.setNext(temp);
                count++;
                break;
            } else {
                aux = aux.getNext();
            }
        }
    }
}

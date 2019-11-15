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
public class NodeD<T> {

    private NodeD<T> next;
    private NodeD<T> last;
    private T elemento;

    public NodeD() {
        this.next = null;
        this.last = null;
        this.elemento = null;
    }
    
    

    public NodeD(T elemento) {
        this.next = null;
        this.last = null;
        this.elemento = elemento;
    }

    public NodeD<T> getNext() {
        return next;
    }

    public void setNext(NodeD next) {
        this.next = next;
    }

    public NodeD getLast() {
        return last;
    }

    public void setLast(NodeD<T> last) {
        this.last = last;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }
    

}

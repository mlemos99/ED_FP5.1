/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_fp_052;

import ed_fp_05.ListADT;

/**
 *
 * @author Utilizador
 */
public interface UnorderedListADT<T> extends ListADT<T> {
    
    public void addToFront(T element);
    
    public void addToRear(T element);
    
    public void addAfter(T element , T atual);
}

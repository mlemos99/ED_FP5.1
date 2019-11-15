/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_fp_054;

import ed_fp_053.*;
import ed_fp_052.*;
import ed_fp_05.*;
import java.util.Iterator;

/**
 *
 * @author Utilizador
 */
public interface ListADT<T> extends Iterable <T> {
    
    public T removeFirst();
    
    public T removeLast();
    
    public T remove (T element);
    
    public T first();
    
    public T last();
    
    public boolean contains (T target);
    
    public boolean isEmpty();
    
    public int size();
    
  
    
    @Override
    public String toString();
    
}

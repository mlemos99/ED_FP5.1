/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_fp_05;

import java.util.Iterator;
import java.util.NoSuchElementException;



/**
 *
 * @author Utilizador
 */
public class ArrayList<T> implements ListADT<T> {
     protected T[] list;
     protected int rear;
     protected static int DEFAULT_CAPACITY=5;

     public ArrayList(int tam) {
        this.list = (T[]) (new Object[tam]);
        this.rear = 0;

    }
     
     public ArrayList() {
        this.list = (T[]) (new Object[DEFAULT_CAPACITY]);
        this.rear = 0;

    }
     

    @Override
    public T removeFirst() {
        int i=0;
        if(this.isEmpty()){
            return null;
        }
        T temp=this.first();
        while(this.list[i]!=null && i<this.rear-1){
            this.list[i]=this.list[i+1];
            i++;
        }
        this.list[this.rear-1]=null;
        this.rear--;
        return temp;
    }

    @Override
    public T removeLast() {
        if(this.isEmpty()){
            return null;
        }
        T temp=this.last();
        this.list[this.rear-1]=null;
        this.rear--;
        return temp;
    }

    @Override
    public T remove(T element) {
        if(this.isEmpty()){
            return null;
        }
        
        int findposition = this.find(element);
        T temp=this.list[findposition];
        for(int i=findposition; i<this.rear-1;i++){
            this.list[i]=this.list[i+1];
        }
        this.list[this.rear-1]=null;
        this.rear--;
        return temp;
        
    }

    @Override
    public T first() {
        if(this.isEmpty()){
            return null;
        }
        return this.list[0];
    }

    @Override
    public T last() {
        if(this.isEmpty()){
            return null;
            
        }
        return this.list[this.rear-1];
        }

    @Override
    public boolean contains(T target) {
       if(this.find(target)!=-1){
           return true;
       } 
       return false;
    }

    @Override
    public boolean isEmpty() {
       return this.rear==0;
    }

    @Override
    public int size() {
        return this.rear;
    }

  

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator();
    }
public int find(T elemento){
    int findposition=0;
        while(!this.list[findposition].equals(elemento) && this.list[findposition]!=null){
         
            findposition++;
            
        }
        if(this.list[findposition].equals(elemento)){
            return findposition;
        }
        
        return -1;
}
public void expandCapacity() {
      T[] auxList = (T[]) (new Object[DEFAULT_CAPACITY * 2]);

        for (int i = 0; i < this.rear; i++) {
            auxList[i] = this.list[i];
        }

        this.list = auxList;
    }
       
    

 private class ArrayIterator implements Iterator<T> {
  public int ArrayIterator=0;
        

        @Override
        public boolean hasNext() {
            return ((ArrayIterator<list.length)&&(list[ArrayIterator]!=null));
        }

        @Override
        public T next() {
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            return list[ArrayIterator++];
        }
     
 }
   
}

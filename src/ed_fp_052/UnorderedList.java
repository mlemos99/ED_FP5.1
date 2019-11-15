/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_fp_052;

/**
 *
 * @author Utilizador
 */
public class UnorderedList<T> extends ArrayList<T> implements UnorderedListADT<T>{

    @Override
    public void addToFront(T element) {
          int i=this.rear-1; 
          
        if (this.rear == this.list.length) {
            this.expandCapacity();
        }
        
        while(i>=0){
            this.list[i+1]=this.list[i];
            i--;
        }
        this.list[0] = element;
        this.rear++;
        
      
        

       
                
            
            
            
    }

    @Override
    public void addToRear(T element) {
          if (this.rear == this.list.length) {
            this.expandCapacity();
        }
        this.list[this.rear] = element;
        this.rear++;
    }

    @Override
    public void addAfter(T element, T atual) {
        int posicao = this.find(atual);
        int i=this.rear-1;
        
        if(posicao<0){
            throw new NegativeArraySizeException("Não existe");
        }
        if (this.rear == this.list.length) {
            this.expandCapacity();
        }
        while(i>posicao){
            this.list[i+1]=this.list[i];
            i--;
        }
        
        this.list[posicao+1] = element;
        this.rear++;
       
    }
    
}

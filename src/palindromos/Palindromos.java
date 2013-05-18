
package palindromos;


public class Palindromos {

    public boolean espalindromo(String cadena){
    boolean valor = true;
    int ind;    
   
    ind=cadena.length();

    for (int i= 0 ;i < (cadena.length()); i++){        
       if (cadena.substring(i, i+1).equals(cadena.substring(ind - 1, ind)) == false ){
            valor=false;
            break;
       }
       ind--;
    }
    return valor;
}

    
    public static void main(String[] args){              

    }    

}

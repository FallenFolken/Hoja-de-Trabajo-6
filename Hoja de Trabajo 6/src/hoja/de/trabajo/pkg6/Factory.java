//Clase:Factory.java
//Clase factory que permite escoger entre las diferentes implementaciones
//Hecho por:            Kimberly Guzmán           Carnet: 13642 
//			Erick Saucedo             Carnet: 13167
//			
//Fecha: 07/09/2014
//***************************************************************
import java.util.*;

public class Factory<E>{
    public Set<E> getSet(int implementado){
        if(implementado==1){
            return new HashSet<E>(); //regresa HashSet
        }else if(implementado==2){
            return new TreeSet<E>(); //regresa TreeSet
        }else if(implementado==3){
            return new LinkedHashSet<E>(); //regresa LinkedHashSet
        }else{
            return null;
        }
    }
}

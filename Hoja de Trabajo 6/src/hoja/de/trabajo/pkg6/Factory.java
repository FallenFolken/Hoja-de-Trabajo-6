/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja.de.trabajo.pkg6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Erick
 */
public class Factory {
   public Set getFactory(int entry) {
        switch(entry){
            case 1:
                return new HashSet ();
            case 2:
                return new TreeSet();
            case 3:
                return new LinkedHashSet();
        }
        return null;
   }
    
}
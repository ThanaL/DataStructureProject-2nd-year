/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;

import java.io.Serializable;

/**
 *
 * @author Thnaa
 */
public class userr implements   Serializable, Comparable<userr>{
       private String id;
private String name;
    private String pas;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public userr(String id, String name, String pas) {
        this.id = id;
        this.name = name;
        this.pas = pas;
    }

   

    


    public String getName() {
        return name;
    }

    public String getPas() {
        return pas;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPas(String pas) {
        this.pas = pas;
    }

  

    @Override
    public int compareTo(userr o) {
if( name.equals(o.getName() )&& pas.equals(o.getPas())                              )
    return 1;
return 0;
    
        
        
        }
    
    
     
}

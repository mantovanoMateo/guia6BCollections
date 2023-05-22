package Models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ABM {
    private HashMap<String,Persona> hasMapPersonas;

    public ABM() {
        hasMapPersonas = new HashMap<>();
    }

    public Boolean agregarPersona(Persona nueva){
        Boolean agregado=false;
        if(!hasMapPersonas.containsKey(nueva)){
            hasMapPersonas.put(nueva.getDni(),nueva);
            agregado=true;
        }
        return agregado;
    }

    public Boolean elimniarPersona(Persona darDeBaja){
        Boolean eliminado=true;
        if(hasMapPersonas.remove(darDeBaja.getDni())==null){
            eliminado=false;
        }
        return eliminado;
    }

    public String devolverDatosOrdenados(){
        String datos="";
        ArrayList<Persona>personas=new ArrayList<>(hasMapPersonas.values());

        Collections.sort(personas);
        for(Persona persona:personas){
            datos+=persona.toString()+"\n";
        }
        return datos;
    }

}

import Models.ABM;
import Models.Persona;

import java.awt.image.ImageProducer;
import java.security.Key;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello HashMaps!");
        Scanner entrada= new Scanner(System.in);

        //region PUNTO UNO
        /*PUNTO UNO
        System.out.println("Ingrese una cadena de texto");
        String cadena=entrada.nextLine();
        HashMap<Character,Integer> letrasCadena=new HashMap<>();
        int i=0,j=0,contador=0;

        for(i=0;i<cadena.length();i++){
            if(!letrasCadena.containsKey(cadena.charAt(i))){
                contador=0;
                for(j=i;j<cadena.length();j++){
                    if(cadena.charAt(j)==cadena.charAt(i)){
                        contador++;
                    }
                }
                letrasCadena.put(cadena.charAt(i),contador);
            }
        }

        letrasCadena.forEach((key,value)->{
            System.out.println("Letra: "+key+ " -> Cantidad de coincidencias: "+ value);
        });

         */
        //endregion

        //region PUNTO DOS
        /*
        System.out.println("Ingrese la cantidad de numeros random que desea generar");
        int i=entrada.nextInt();
        entrada.nextLine();
        Random random=new Random();
        ArrayList<Integer> numeros=new ArrayList<>();
        HashSet<Integer>integers=new HashSet<>();

        for(int j=0;j<i;j++){
            numeros.add(random.nextInt(0,9));
        }

        System.out.println(numeros);

        Collections.sort(numeros);

        System.out.println("Ya ordenado\n"+numeros);

        for (i=0;i<numeros.size();i++){
            integers.add(numeros.get(i));
        }

        System.out.println("\nHashSet de numeros sin repeticion\n   |\n   V\n" + integers);

         */
        //endregion

        //region PUNTO 3
        /*
        TreeMap<Integer,String> arbolito=new TreeMap<>();
        char control=' ';
        int edad=0;
        String nombre="";

        do{
            System.out.println("Ingrese el nombre de la persona");
            nombre=entrada.nextLine();
            System.out.println("Ahora ingrese la edad");
            edad=entrada.nextInt();
            entrada.nextLine();
            System.out.println("Desea seguir? -> [s/n]");
            control=entrada.nextLine().charAt(0);
            arbolito.put(edad,nombre);

        }while(control!='n');

        System.out.println(arbolito);
         */
        //endregion

        //region PUNTO 4
        /*
        //PUNTO 4
        Random randomizer=new Random();
        ArrayList<Integer> numeritos=new ArrayList<>();

        for(int i=0;i<15;i++){
            numeritos.add(randomizer.nextInt(0,9));
        }
        System.out.println("Numeritos : "+numeritos);
        HashMap<Integer,Integer> frecuenciasNumeros=new HashMap<>();
        for (int i=0;i<numeritos.size();i++){
            if(!frecuenciasNumeros.containsKey(numeritos.get(i))){
                frecuenciasNumeros.put(numeritos.get(i),1);
            }else{
                frecuenciasNumeros.put(numeritos.get(i),(frecuenciasNumeros.get(numeritos.get(i))+1));
            }
        }

        System.out.println("\nfrecuencias numeros: "+frecuenciasNumeros);
        int suma=numeritos.stream().mapToInt(Integer::valueOf).sum();
        System.out.println("Suma del array: "+ suma+"\nNumero promedio: "+String.format("%.2f",(double)suma/ numeritos.size()));
         */
        //endregion

        //region PUNTO 5
        //PUNTO 5
        /*
        TreeSet<Integer> arbolitoSet=new TreeSet<>();
        Random randomixer=new Random();
        for(int i=0;i<15;i++){
            arbolitoSet.add(randomixer.nextInt(0,9));
        }

        System.out.println("ArbolitoSet Desoredenado\n");
        System.out.println(arbolitoSet);

        System.out.println("\n-------------------\nAhora en ascendente\n------------------------\n");
        Iterator<Integer> it=arbolitoSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("\n-------------------\nAhora en descendente\n------------------------\n");
        it=arbolitoSet.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        */
        //endregion

        //PUNTO 6
        Persona p1=new Persona("Mateo","42322678",23);
        Persona p2=new Persona("Ignacio","47540690",16);
        Persona p3=new Persona("Tomas","52345620",13);
        Persona p4=new Persona("Paola","25153012",47);
        Persona p5=new Persona("Pablo","20633314",54);

        ABM abm=new ABM();
        abm.agregarPersona(p1);
        abm.agregarPersona(p2);
        abm.agregarPersona(p3);
        abm.agregarPersona(p4);
        abm.agregarPersona(p5);

        System.out.println(abm.devolverDatosOrdenados());

    }
}
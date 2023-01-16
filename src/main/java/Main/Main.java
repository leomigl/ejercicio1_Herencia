
 

package Main;

import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;

/**
 *
 * @author PC
 */
public class Main {

    public static void main(String[] args) {
       Animal perro1=new Perro("Stich","Carne" ,15 ,"doberman");
       perro1.alimento();
       Animal perro2=new Perro("Teddy","croquetas", 10,"chihuahua");
       perro2.alimento();
       Animal gato1=new Gato("pelusa", "galletas", 15, "siames");
       gato1.alimento();
       Animal caballo1 =new Caballo("Spark", "pasto", 25,"fino" );
       caballo1.alimento();
    }
}

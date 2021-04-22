
/**
 * Write a description of class Calculardor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculador
{
     private Punto punto;
     public Calculador(Punto p1){
         this.punto = p1;       
        }
     public double calcularDistancia(Punto otro ){
         double distancia;
         distancia= Math.sqrt(Math.pow(punto.getX()-otro.getX(),2)+Math.pow(punto.getY()-otro.getY(),2));
         return distancia;
        }
}

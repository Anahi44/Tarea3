
/**
 * Write a description of class Cuadrado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cuadrado
{
    private double base;
    private double altura;
    public Cuadrado (double b, double a){
       this.base=b;
       this.altura=a;
    }
    public double  calcularArea(){
        double area;
        area = base * altura;
        return area;
    }
}

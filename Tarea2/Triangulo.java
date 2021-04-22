
/**
 * Write a description of class Triangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangulo
{
    private double hipotenusa;
    private double cateto;
    
    public Triangulo(double hipotenusa, double cateto){
        this.hipotenusa=hipotenusa;
        this.cateto=cateto;
    }
    
    public double otroCateto(){
        double otroCateto;
        otroCateto = Math.sqrt(Math.pow(hipotenusa,2)-Math.pow(cateto,2));
        if (hipotenusa<cateto+otroCateto){
            return 0;
        }
        return otroCateto;
    }
}


/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculadora
{
    private Triangulo triangulo;
    private Recta ecuaion;
    public double cateto(Triangulo triangulo){
        return triangulo.otroCateto();
    }
    public String ecuacion(Recta ecuacion){
        return ecuacion.ecuacionRecta(punto);
    }
}

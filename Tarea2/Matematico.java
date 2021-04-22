
/**
 * Write a description of class Matematico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Matematico
{
    private Robot indicador;
    private Cuadrado area;
    private Ubicador cuadrante;
    private Calculador distancia;
    private Calculadora calculadora;
    public Matematico(Robot i, Cuadrado a, Ubicador c, Calculador d){
        indicador = i;
        area = a;
        cuadrante = c;
        distancia = d;
    }
    public double cuadrado(Cuadrado area){
        return area.calcularArea();
    }
    public double cateto(Calculadora calculadora){
        return calculadora.cateto(triangulo);
    }
    public double distancia(Calculador distancia){
        return distancia.calcularDistancia(punto); 
    }
    public String cuadrante(Ubicador cuadrante){
        return cuadrante.indicarCuadrante(punto);
    }
    public int numeroMedio(Robot indicador){
        return indicador.nuemeroMedio(_a_, _b_, _c_);   
    }
    public int numeroMayor (Robot indicador){
        return indicador.numeroMayor(_a_, _b_, _c_);
    }
    public int numeroMenor(Robot indicador){
        return indicador.numeroMenor(_a_, _b_, _c_);   
    }
}

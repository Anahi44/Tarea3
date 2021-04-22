
/**
 * Write a description of class Recta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Recta
{
    private Punto punto;
    public Recta (Punto punto){
        this.punto=punto;
    }
    public String  ecuacionRecta(Punto otro){
        String  recta;
        int ordenada;
        int absisa;
        int resX;
        int resY;
        String respuesta;
        ordenada = otro.getX() - punto.getX();
        absisa   = otro.getY() - punto.getY();
        resX = ordenada *(-punto.getY());
        resY = absisa*(-punto.getX());
        recta= ordenada+"Y"+"="+absisa+"X"+(resX+resY);
        return recta;
    }
}

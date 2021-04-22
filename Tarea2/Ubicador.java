
/**
 * Write a description of class Ubicador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ubicador
{
    private Punto punto;
    public Ubicador(Punto punto){
        this.punto = punto;
    }
    private  Ubicador(int x,int y){
        punto = new Punto(x,y);
    }
    public String indicarCuadrante(Punto punto){
        if(punto.getX()> 0 &&punto.getY()>0){
            return "el punto esta en el cuadrante 1";
        }if (punto.getX()<0 && punto.getY()<0){
            return "el punto esta en el cuadrante 3"; 
        }if (punto.getX()<0 && punto.getY()>0){
            return "el puento esta en el cuadrante 2";
        }else{
            return "el punto esta en el cuadrante 4";
        }
    }
}

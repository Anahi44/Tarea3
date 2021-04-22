
/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot
{
    private int numero1;
    private int numero2;
    private int numero3;
    public Robot(int a, int b, int c){
        this.numero1 = a;
        this.numero2 = b;
        this.numero3 = c;
    }
    public int  numeroMayor(int a, int b, int c){

        if (a>b && a>c ){
            return a;
        } if (c>b){
            return c;
        }else{
            return b;
        }
    }
    public int numeroMenor(int a , int b, int c){
        if (a<b && a<c){
            return a;
        }if (b<c){
            return b;
        }else{
            return c;
        }
    }
    public int nuemeroMedio(int a, int b, int c){
        if (b>a && a<c){
            return a;
        }if (a>b && b<c){
            return b;
        }else {
            return c;
        }
    }
}

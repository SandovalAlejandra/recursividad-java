
package Modelo;

public class ConteoRecursivo {
    
    private int num;

    public ConteoRecursivo(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public String getInformacion(){
        
        return "La cantidad de cifras que tiene el número "+getNum()+" es "+recursividad(getNum())+
                "\n__________________________________\n";
    }
    
    public int recursividad(int num) {
        if(num < 10) {
            return 1;
        } else {
            return 1 + recursividad(num / 10);
        }
    }
}

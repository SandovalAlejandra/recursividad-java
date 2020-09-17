
package Modelo;

public class SumaRecursiva {
    
    private int num;

    public SumaRecursiva(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public String getInformacion(){
        
        return "La sumatoria de todos los numeros enteros positivos hasta el "+getNum()+" es "+recursividad(getNum())+
                "\n__________________________________\n";
    }
    
    public int recursividad(int num) {
        if(num == 1) {
            return num;
        } else {
            return num + recursividad(num - 1);
        }
    }
    
}

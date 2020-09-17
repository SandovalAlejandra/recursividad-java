
package Modelo;

public class RestoRecursivo {
    
    private int numberOne;
    private int numberTwo;

    public RestoRecursivo(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public int getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }
    
    public String getInformacion(){
        
        return "El resto de "+getNumberOne()+" entre "+getNumberTwo()+" es "+recursividad(getNumberOne(), getNumberTwo())+
                "\n__________________________________\n";
    }
    
    public int recursividad(int numberOne, int numberTwo) {
        if(numberOne < numberTwo) {
            return numberOne;
        } else {
            return recursividad(numberOne - numberTwo, numberTwo);
        }
    }
}

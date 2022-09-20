package project;

public class Addition {
    public int add(int num1, int num2){
        return num1 + num2;
    }

    public boolean checkGuess(int num1,int num2, int guess){
        if((num1 + num2) == guess){
            return true;
        }else{
            return false;
        }
    }
}

import java.util.*;
public class Test {
    public static void main(String[] args){
    PuzzleJava rand = new PuzzleJava();
    
    
     //get ten rolls
        System.out.println("-----getTenRolls-----");
        System.out.println(rand.getTenRolls());


    //get random letter
        System.out.println("-----getRandomLetter-----");
        System.out.println(rand.getRandomLetter());


     //get password
        System.out.println("-----generatePassword-----");
        System.out.println(rand.generatePassword());


    //get new password set
        System.out.println("-----getNewPasswordSet-----");
        System.out.println(rand.getNewPasswordSet(3));

        
}
}
import java.util.*;
class PuzzleJava{
    
    //get ten
    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> randInt = new ArrayList<Integer>();
        Random randNum = new Random();
        for(int i = 0; i<=10; i++){
            randInt.add(randNum.nextInt(20)); 
    }
    return randInt;
}

    //get letter
    public String getRandomLetter(){
        String alphabet = "abcdefghijklmnopqrstuvqxyz";
        Random randChar = new Random();
        char rando = alphabet.charAt(randChar.nextInt(26));
        return String.valueOf(rando);
    }


    //generate password
    public String generatePassword(){
        String password = "";
        for(int i = 0; i<= 8; i++){
            password += getRandomLetter(); 
        }
        return password;
    }


    //get new password set
    public ArrayList<String> getNewPasswordSet(int length){
        ArrayList<String> newPassword = new ArrayList<String>();
        for(int i = 0; i<= length; i++){
            newPassword.add(generatePassword());
        }
        return newPassword;

}
}
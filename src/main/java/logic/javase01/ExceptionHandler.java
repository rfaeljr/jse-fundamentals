//When the abnormal situation happen in execution of the code
//In Java Language is launch events of exceptions
//Used for programmers for situations contour
package logic.javase01;

/**
 *
 * @author rafaelcosta
 */
public class ExceptionHandler {
    public static void main(String[] args){
        String[] students = {"Carlos", "Rafael", "Bea"};
        //Exceptions more common
        //Access index not exist in array
        try{
            String lastName = " Costa";
            students[0] += lastName;
            students[4] += lastName;
        }
        catch(ArrayIndexOutOfBoundsException arrayException){
            arrayException.printStackTrace();
        }
        
        //Except launched when an object that don't was initialized it's used
        try{
            LionPolimorfism lion = null;
            lion.getHabitat();
        }
        catch(NullPointerException nullException){
            nullException.printStackTrace();
        }
        
        //Except launched when a divide um number for zero
        try{
            int num = 5;
            float result = 0.0f;
            result = num / 0;
        }
        catch( ArithmeticException aritException  ){
            aritException.printStackTrace();
        }
    }

}

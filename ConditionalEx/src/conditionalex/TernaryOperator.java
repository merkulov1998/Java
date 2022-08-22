/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalex;

public class TernaryOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     


        int x = 4, y = 27, z=0; //инициализация переменных
        z=(y/x<3)?(x+=y):(x*=y);
        /*
        если условие (y/x<3) истинно, то выполняется выражение (x+=y), иначе выполняется выражение (x*=y)
         */
        /*if (y / x < 3) {
            x += y;
        } else {
            x *= y;
        }
         */
        System.out.println("After if stmt, x = " + x);

         // Use a ternary operator to perform the same logic as above.

    }
}

      
    


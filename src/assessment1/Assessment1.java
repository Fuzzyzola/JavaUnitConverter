/*
Creator:
    Ethan Dominy
Creation Date:
    29/02/16
Methods:
    + void main (String [] args)
Classes this class requires
    Java.util.scanner
*/

package assessment1;
import java.util.Scanner;
/**
 *
 * @author 041603346
 */
public class Assessment1 
{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in); 
        int choice;
        do 
        {
            //display main menu
            System.out.println("Choose an option");
            System.out.println("1. Convert CM to Inches");
            System.out.println("2. Convert Metres to Feet");
            System.out.println("3. Exit");
            //get user choice
             choice = input.nextInt();
            
            //enter values
            switch (choice) 
            {
                case 1: 
                    System.out.println("Enter your value");
                    double cms = input.nextDouble();
                    double inches = cms * 0.393701;
                    System.out.println(inches + " inches");
                    break;
                case 2:
                    System.out.println("Enter your value");
                    double metres = input.nextDouble();
                    double feet = metres * 3.280084;
                    System.out.println(feet + " feet");
                    break;
                case 3:
                    break;
            }
            //loop unless exit is chosen
        } while (choice != 3);
        
    }
    
}

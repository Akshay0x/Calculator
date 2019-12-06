import java.util.Scanner;

public class MyCalculator{
    public static void main(String[] args)
    {
        try(Scanner sc= new Scanner(System.in)){

            float n1,n2,result;
            int choice;
            boolean exit=false;

            while(!exit){
                result=0;
                System.out.println("1 Sum");
                System.out.println("2 Difference");
                System.out.println("3 Product");
                System.out.println("4 Quotient");
                System.out.println("9 EXIT");
                System.out.println("Enter Choice");
                choice=sc.nextInt();
                if(choice==9)
                    break;
                System.out.println("Enter 2 Numbers");
                n1= sc.nextFloat();
                n2= sc.nextFloat();

                switch(choice){

                    case 1: result= n1+n2;
                        break;
                    case 2: result= n1-n2;
                        break;
                    case 3: result= n1*n2;
                        break;
                    case 4: if(n2 != 0)
                                result= n1/n2;
                            else
                                throw new Exception("Divide By Zero Exception");
                        break;
                    default:  System.out.println("Invalid Choice");
                        continue;
                }
                if(exit==false)
                    System.out.println("Result = "+result);

            }
        }catch(Exception e){
            e.printStackTrace();
        }
         System.out.println("Exited Successfully");
    }

}
import java.util.Scanner;

class hackathon2
{
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);

    System.out.println("Waste collected in kilograms: ");
 
    double wastecollected = sc.nextDouble();
   
    if (wastecollected >= 100.0) 
        {
            System.out.println("Collection Target Achieved");
        } 
        else 
        {
            System.out.println("More Waste Collection Required");
        }

        sc.close();
    }
}




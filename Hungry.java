import java.util.*;

public class Hungry{
    
    public static void main(String[] args) {
	 System.out.println("I am Snehal");
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you hungry ?");
        char c = sc.next().charAt(0);
        if(c=='Y' || c=='y')
           { System.out.println("eat Samosa");}
        else
            {System.out.println("Are you thirsty then drink water");

        }
    }
}
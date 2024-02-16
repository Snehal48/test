import java.util.*;

public class Hungry{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you hungry ?");
        char c = sc.next().charAt(0);
        if(c=='Y' || c=='y')
            System.out.println("eat Samosa");
        else
            System.out.println("do coding");
    }
}
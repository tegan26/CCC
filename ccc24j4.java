import java.util.Scanner;
import java.util.ArrayList;

public class ccc24j4 {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        String m = input.nextLine();
        char sillyKey;
        char replaced;
        char quiet;
        ArrayList<String> wrong = new ArrayList<String>();
        //ArrayList<String> quiet = new ArrayList<String>();

        for(int i = 0; i < n.length(); i++)
        {
            if(n.charAt(i) != m.charAt(i))
            {
                sillyKey = n.charAt(i);
                replaced = m.charAt(i);
                break;
            }
        }
        
        System.out.println(sillyKey + " " + replaced);
        System.out.println("-");

    }
}


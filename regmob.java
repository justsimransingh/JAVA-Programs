import java.util.regex.*;
import java.util.Scanner;
class regmob
{   
    public static void main(String [] args)
    {
        System.out.println("Enter phone number");
        String mail=new Scanner(System.in).nextLine();
        //String pat="^[0|\\+91]{1,3}{1}[6-9]{1}[0-9]{9}$";
        String pat="^\\+{1}[1-9]{1,3}[6-9]{1}[0-9]{9}$";
        Pattern p=Pattern.compile(pat,Pattern.CASE_INSENSITIVE);
        Matcher m=p.matcher(mail);
        boolean isMat=m.matches();
        System.out.println(isMat);
    }
}
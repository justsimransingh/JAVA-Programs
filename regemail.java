import java.util.regex.*;
import java.util.Scanner;
class regemail
{   
    public static void main(String [] args)
    {
        System.out.println("Enter an email address");
        String mail=new Scanner(System.in).nextLine();
        String pat="^[A-Z_0-9]{1,}@{1}[A-Z0-9]{2,6}\\.{1}[A-Z]{2,6}$";
        Pattern p=Pattern.compile(pat,Pattern.CASE_INSENSITIVE);
        Matcher m=p.matcher(mail);
        boolean isMat=m.matches();
        System.out.println(isMat);
    }
}


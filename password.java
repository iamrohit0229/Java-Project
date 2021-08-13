import java.util.*;

public static class Password
{
    public static void main(String[] args)
    {

        int len = 16;
        System.out.println(password_Generate(len));
    }

    public static char[] password_Generate(int len)
    {
        System.out.println("Generating password");
        System.out.print("Your new password is : ");

        String UpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String LowerCase = "abcdefghijklmnopqrstuvwxyz";
        String Number = "0123456789";
        String Symbols = "(!@#$%^&*_=+-/.?<>)";
        String str = UpperCase + LowerCase + Number + Symbols;

        Random obj = new Random();
        char password[] = new char[len];
        for (int i = 0; i < len; i++)
        {
            password[i] =str.charAt(obj.nextInt(str.length()));
        }
        return password;
    }
}

// (OTP Generation Program)
class Otp
{
    public static String otp_Generate(int len)
    {
        String str = "abcdefghijklmnopqrstuvwxyzABCD"+"EFGHIJKLMNOPQRSTUVWXYZ0123456789";
        int n = str.length();

        String OTP="";  // String type variable OTP to store the generated OTP

        for (int i = 1; i <= len; i++)
        {
            OTP = OTP + (str.charAt((int) ((Math.random()*10) % n)));
        }

        return(OTP);
    }

    public static void main(String[] args)
    {
        int len = 6;
        System.out.println("Your OTP is - "+otp_Generate(len));
    }
}

// Time Complexity of the Program: O(n) where n is number of character in Otp
// generated.

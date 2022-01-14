import java.io.*;
class password
{
  public static String merge(String s1, String s2)
  {
    StringBuilder result = new StringBuilder();
    for (int i=0; i < s1.length() || i < s2.length(); i++)
    {
      if (i < s1.length())
         result.append(s1.charAt(i));
         
      if (i < s2.length())
         result.append(s2.charAt(i));
     }
     return result.toString();
  }
  public static void main(String args[])throws IOException
  {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s1, s2;
    System.out.println("Enter a word");
    s1 = in.readLine();
    System.out.println("Enter another word");
    s2 = in.readLine();
    System.out.println("Your new Password is: "+merge(s1, s2));
   }
}

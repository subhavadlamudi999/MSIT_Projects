import java.util.*;
public class Count_Consonets_Ovels 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int consonants=0,vowels=0;
		System.out.println("Enter a String");
		Scanner sc=new Scanner(System.in);
		String b=sc.nextLine();
		for(int i = 0; i < b.length(); ++i)
        {
            char ch = b.charAt(i);
            if((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')||(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'))
            {
		
                vowels++;
            }
            
            else if((ch >= 'a'&& ch <= 'z')||(ch >= 'A'&& ch <= 'Z')) 
            {
                consonants++;
            }
     
        }
		System.out.println("Number of vowles ="+vowels);
		System.out.println("Number of consonants ="+consonants);
		
	}

}

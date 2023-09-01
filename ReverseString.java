import java.util.*;
public class ReverseString {
	public static char[] Reverse(String str)
	{	
		char[] tempArray = str.toCharArray();
		
		int i = 0;
		int j = tempArray.length-1;

		while(i<=j)
		{
			char temp = tempArray[i];
			tempArray[i] = tempArray[j];
			tempArray[j] = temp;
			
			i++;
			j--;
		}
		
		return tempArray;
	}

	public static void main(String[] args) {
		String str = "EY LLP";
		char[] ans = Reverse(str);
		
		for (char c : ans)
            System.out.print(c);
        System.out.println();
	}

}

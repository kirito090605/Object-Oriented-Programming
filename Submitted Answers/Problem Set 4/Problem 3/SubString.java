public class SubString
{
	 public static void main(String[] args) 
	 {
        // Test 
        System.out.println("cat, The cat in the hat." + " is " + isSubString("cat", "The cat in the hat.")); // true
        System.out.println("bat, The cat in the hat." + " is " + isSubString("bat", "The cat in the hat.")); // false
        System.out.println("The, The cat in the hat." + " is " + isSubString("The", "The cat in the hat.")); // true
        System.out.println("hat., The cat in the hat." + " is " + isSubString("hat.", "The cat in the hat.")); // true
    }

    public static boolean isSubString(String sub, String main)
	{
		int subLength = sub.length();	//3
		int mainLength = main.length();	

		for(int i = 0; i < mainLength; i++)	
		{
			int j;
			for(j = 0; j < subLength; j++)	
			{
				if(sub.charAt(j) != main.charAt(j + i))
					break;
			}
			if(j == subLength)
				return true;
		}
		return false;
	}

}
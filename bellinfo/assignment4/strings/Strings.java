package bellinfo.assignment4.strings;

import java.lang.reflect.Array;

public class Strings {

	public static void main(String[] args) {
		String s="This is a Java class";
		int x = countWords(s);
		int y=numberOfChar(s);
	     System.out.println("number of words are" +x);
		
		 System.out.println("Length of the string is "+s.length());
           
		 System.out.println("number of characters in a string" +y);
		 reverseString(s);
		 String reverse=new StringBuffer(s).reverse().toString();
		 System.out.println("Printing the string in reverse order- "+reverse);
		 letterAtCenter(s);
		 String replace=s.replace("Java", "SQL");
		 System.out.println("Replacing Java with SQL is - "+replace);
		 index(s);
		 Rep Obj=new Rep();
		 Obj.nOfTimes(s);
/*index of each letter*/	
		 System.out.println("index of each letter in a string");
		 for(int i=0;i<s.length();i++){
			 int a=s.indexOf(s.charAt(i));
			 System.out.println(a+"   "+s.charAt(i));
		 }
		 /*index of each word*/
		 String[] words=s.split(" ");
		 System.out.println("Index of each word in a string");
		 for(int c=0;c<Array.getLength(words);c++){
			
			 int b=s.indexOf(words[c].charAt(0));
			 System.out.println(b+" " +words[c]);
		 }
		 System.out.println("Given string in upper case- "+s.toUpperCase());
		 System.out.println("Given string in lower case- "+s.toLowerCase());
		 
	}
public static int countWords(String s){
	if(s==null||s.isEmpty())
		return 0;
	int count =0;
	for (int i=0;i<s.length();i++)
	{
		if(s.charAt(i)!= ' ')
		{
			count++;
			while(s.charAt(i)!=' '&&i<s.length()-1)
			{
				i++;
			}
		}
	}
	return count;
}
public static int numberOfChar(String s){
	int count=0;
	for(int i=0;i<s.length();i++){
		if(s.charAt(i)!=' '){
			count++;
		}
	}
	return count;
}
static void reverseString(String s){
	//String s="This is a Java Class";
	String[] words=s.split(" ");
	String ReverseString="";
	for(int i=0;i<words.length;i++)
	{
		String word=words[i];
		String reverseword="";
		for(int j=word.length()-1;j>=0;j--){
			reverseword=reverseword+word.charAt(j);
		}
		
		ReverseString=ReverseString+reverseword+"";
	}
	System.out.println(s);
	System.out.println("ReverseString is - " +ReverseString);
	
}
public static void letterAtCenter(String s){
	if(s.length()%2==0){
		System.out.println("Letter at the center is " +s.charAt((s.length()/2)));
	}
	else {
		System.out.println("Letter at the center is" +s.charAt((s.length()/2)+1));
	}
}
public static void index(String s){
	if(s.length()%2==0){
		System.out.println("index of the Letter at the center is " +s.indexOf(s.charAt((s.length()/2))));
	}
	else {
		System.out.println("Index of the Letter at the center is" +s.indexOf(s.charAt((s.length()/2)+1)));
	}
}
}
class Rep{
	

public void nOfTimes(String s)
		{
			char k;
			char j;
			for(j='a';j<='z';j++)
			{
				int c=0;
				for(int i=0;i<s.length();i++)
				{
					k = s.charAt(i);
					if(j==k)
					{
						c++;
					}
				}
				if(c!=0)
				{
					System.out.println(j+"\t"+c);
				}
			}
			
		}
}
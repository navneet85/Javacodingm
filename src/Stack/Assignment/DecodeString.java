package Stack.Assignment;

public class DecodeString {
	void reverse(String str)
	{
		if ((str==null)||(str.length() <= 1))
		System.out.println(str);
		else
		{
			System.out.print(str.charAt(str.length()-1));
			reverse(str.substring(0,str.length()-1));
		}
	}
	public static void main(String[] args)
	{
		String str = "Geeks for Geeks";
		DecodeString obj=new DecodeString();
		obj.reverse(str);
	}
}

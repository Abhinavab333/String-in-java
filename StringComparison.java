class StringComparison
{
	public static void main(String args[])
	{
		//.equals() operator use
		String s1="babhinav";
		String s2="abhinav vishwakarma";
		String s=new String("abhinav");
		String s4="sABHINAV";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));
		//compare == operator
		System.out.println(s1==(s2));
		System.out.println(s1==(s));
		//compareTo operator
		System.out.println("\n");
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s4));
		//toString method
		Integer a=5;
		System.out.println(a.toString());
		System.out.println(s2.indexOf("vishwakarma"));
		//contains method
		System.out.println(s1.contains("abhiv"));


	}

	
}
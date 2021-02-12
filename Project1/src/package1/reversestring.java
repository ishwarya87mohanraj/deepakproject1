package package1;

public class reversestring {
public static String stringreverse(String str) {
	char ch[] = str.toCharArray();
	String s="";
	for (int i=ch.length - 1;i>=0;i-- )
	{
		s+= ch[i];
	}
	return s;
}

public static void main(String[] args) {
	System.out.println(reversestring.stringreverse("ishwarya"));
}
}
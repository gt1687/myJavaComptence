
public class Test2 {

	public static void main(String[] args) {
		String str="ZAsdhgh";
		
		int [] count = new int [256];

	    for ( int i=0 ;i<str.length() ; i++){
	        count[i]=str.charAt(i);
	    }
System.out.println(count[0]);

	}

}

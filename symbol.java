package symbol;

public class symbol {

	public static void main(String[] args) {
		String str = "My cat asshole. My cat asshole. My cat asshole.";
		System.out.println("количество символов "+str.length());
		String[] slov=str.split(" ");
		
		System.out.println(slov[0]+" "+slov[1] +" "+slov[2]+" "+slov[3]+" ");
		System.out.println(slov[4]+" "+slov[5]+" "+slov[6]);
		System.out.println(slov[7]+" "+slov[8]);
		}
}	



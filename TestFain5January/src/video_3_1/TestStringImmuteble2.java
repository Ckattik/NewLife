package video_3_1;

public class TestStringImmuteble2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		String str = "Helloqweeqeqe";
		String str1 = str.substring(0,8);
		
	
		
		System.out.println(str1);
		
		
		String str0 = "�������";
		String str2 = "�������";
		
		boolean mas = str0.contains(str2);
		
		System.out.println(mas);
		
		boolean rez = str0.equals("�������");
		System.out.println(rez);
		
		char s = str0.charAt(2);
		System.out.println(6);
		
		char data [] = {'a','b','c','d'};
		String str5 = new String(data);
		
		boolean rez1 = str5.equals(data);         // false
	
		String sx = "dwqg ew gde wdu wd";
		
		String [] mass = sx.split(" ");
		for(String word : mass) {
//			System.out.println(word);
		}
	}

}

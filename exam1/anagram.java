import java.util.*;
public class anagram{
	public static boolean ana(String s, String t){
		s=s.toLowerCase();
		t=t.toLowerCase();

		String sa[] = s.split(" ");
		String ta[] = t.split(" ");
	
		Arrays.sort(sa);
		Arrays.sort(ta);

		// System.out.println(Arrays.toString(sa));
		// System.out.println(Arrays.toString(ta));
		
		String s1 = "";
		String t1 = "";
		for (int i=0;i<sa.length ; i++) {
			s1=sa[i]+s1;
		}
		char sc[] = s1.toCharArray();
		Arrays.sort(sc);
		for (int i=0;i<ta.length ; i++) {
			t1=ta[i]+t1;
		}
		char tc[] = t1.toCharArray();
		Arrays.sort(tc);
		if (Arrays.equals(sc,tc)) {
			
			return true;
		}
		else{
			
			return false;
		}
	}
	public static void main(String[] args) {
		String s1 = "anagram";
		String t1 = "nagaram";
		System.out.println(ana(s1,t1));
		String s2 = "Keep";
		String t2 = "Peek";
		System.out.println(ana(s2,t2));
		String s3 = "Mother In Law";
		String t3 = "Hitler Woman";
		System.out.println(ana(s3,t3));
		String s4 = "School Master";
		String t4 = "The Classroom";
		System.out.println(ana(s4,t4));
		String s5 = "ASTRONOMERS";
		String t5 = "NO MORE STARS";
		System.out.println(ana(s5,t5));
		String s6 = "Toss";
		String t6 = "Shot";
		System.out.println(ana(s6,t6));
		String s7 = "joy";
		String t7 = "enjoy";
		System.out.println(ana(s7,t7));
		String s8 = "Debit Card";
		String t8 = "Bad Credit";
		System.out.println(ana(s8,t8));
		String s9 = "SiLeNt CAT";
		String t9 = "LisTen AcT";
		System.out.println(ana(s9,t9));
		String s10 = "Dormitory";
		String t10 = "Dirty Room";
		System.out.println(ana(s10,t10));

	}
}

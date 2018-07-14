import java.util.*;
public class Paranthesisgen{
	public static void gen(int n){
		ArrayList<String> res = new ArrayList<String>();
		ArrayList<Integer> dif = new ArrayList<Integer>();
	 
		res.add("");
		dif.add(0);
	 
		for (int i=0;i<2*n;i++){
			ArrayList<String> temp1 = new ArrayList<String>();
			ArrayList<Integer> temp2 = new ArrayList<Integer>();
	 
			for (int j=0;j<res.size();j++){
				String s=res.get(j);
				int k=dif.get(j);
				if (i<2*n-1){
					temp1.add(s+"(");
					temp2.add(k+1);
				}
				if (k>0 && i<2*n-1 || k==1 && i==2*n-1) {
					temp1.add(s+")");
					temp2.add(k-1);
				}
			}
			res = new ArrayList<String>(temp1);
			dif = new ArrayList<Integer>(temp2);
		}
		System.out.println(res+" - "+res.size());
	}
	public static void main(String[] args)
	{	
		gen(2);
		gen(3);
		gen(5);
		gen(4);
		gen(1);
		gen(6);		
	}
}

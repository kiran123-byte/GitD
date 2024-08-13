package what;

import java.util.ArrayList;

public class who {
	
	
		public static void main(String[] args) {
			 final int b=10;
			System.out.println(b);
		int[] arr1=new int[4];
			arr1[0]=10;
			arr1[1]=20;
			arr1[2]=30;
			for(int i=0;i<3; i++)
			{
			   System.out.println(arr1[i]);
			}
			ArrayList<String> a= new ArrayList<String>();
			a.add("rahul");
			a.add("shetty");
			a.add("academy");
			
			for (int i=0;i<3;i++)
			{
				System.out.println(a.get(i));
			}
			
			String s1= new String();
			s1="rahul sheety acdemy";
			String s2="rahul sheety acdemy";
			System.out.println(s1);
			System.out.println(s2);
			for(int i=0; i<s1.length();i++)
			{
			System.out.println(s1.charAt(i));
			}
			
			String s="Rahul shetty academy";
			s.split(" ");
			String[] splittedstring=s.split(" ");
			System.out.println(splittedstring[0]);
			System.out.println(splittedstring[1]);
			System.out.println(splittedstring[2]);
			
			
		}
	}

	 





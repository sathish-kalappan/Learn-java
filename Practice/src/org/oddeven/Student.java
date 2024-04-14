package org.oddeven;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Student extends Details {
	public static void main(String[] args) {
		Student a1 = new Student();
		a1.setStdName("Akash");
		a1.setStdId(123);
		a1.setStdPhNum(1234567890l);
		a1.setDob("12/03/2012");
		a1.setAddress("T.Nagar");
		a1.seteMail("akash@gmail.com");
		a1.setGender("male");
		
		Student a2 = new Student();
		a2.setStdName("Banu");
		a2.setStdId(234);
		a2.setStdPhNum(9876543210l);
		a2.setDob("18/05/2012");
		a2.setAddress("AnnaNagar");
		a2.seteMail("banu@gmail.com");
		a2.setGender("female");
		
		Student a3 = new Student();
		a3.setStdName("Divya");
		a3.setStdId(345);
		a3.setStdPhNum(9954368386l);
		a3.setDob("08/02/2012");
		a3.setAddress("Guindy");
		a3.seteMail("divya@gmail.com");
		a3.setGender("female");
		
		Student a4 = new Student();
		a4.setStdName("Krish");
		a4.setStdId(456);
		a4.setStdPhNum(8809987654l);
		a4.setDob("21/04/2012");
		a4.setAddress("Adayar");
		a4.seteMail("krish@gmail.com");
		a4.setGender("male");
		
		Student a5 = new Student();
		a5.setStdName("Regu");
		a5.setStdId(567);
		a5.setStdPhNum(7506978234l);
		a5.setDob("30/11/2012");
		a5.setAddress("Velacherry");
		a5.seteMail("regu@gmail.com");
		a5.setGender("male");
		
		Map<Integer, Details> m = new LinkedHashMap<Integer, Details>();
		m.put(1, a1);
		m.put(2, a2);
		m.put(3, a3);
		m.put(4, a4);
		m.put(5, a5);
		
		Set<Entry<Integer, Details>> s = m.entrySet();
		for (Entry<Integer, Details> e : s) {
			
			System.out.println("\nStudent "+e.getKey());
			System.out.println("Student Name:"+e.getValue().getStdName());
			System.out.println("Student Id:"+e.getValue().getStdId());
			System.out.println("Student PhNum:"+e.getValue().getStdPhNum());
			System.out.println("Student DOB:"+e.getValue().getDob());
			System.out.println("Student Address:"+e.getValue().getAddress());
			System.out.println("Student Email:"+e.getValue().geteMail());
			System.out.println("Student Gender:"+e.getValue().getGender());
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

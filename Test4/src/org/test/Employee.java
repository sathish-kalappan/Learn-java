package org.test;

import java.security.KeyStore.Entry;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Employee extends Client{
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpId(123);
		e1.setEmpName("Anu");
		e1.setEmpAddress("Chennai");
		e1.setEmpPhNum(9894437617l);
		e1.setDob("12/03/1990");
		e1.setDoj("06/10/2012");
		e1.seteMail("anu@gmail.com");
		e1.setGender("female");
		e1.setSal(984567.80);
		
		Employee e2 = new Employee();
		e2.setEmpId(456);
		e2.setEmpName("Anitha");
		e2.setEmpAddress("Trichy");
		e2.setEmpPhNum(9876543210l);
		e2.setDob("19/07/1995");
		e2.setDoj("06/10/2015");
		e2.seteMail("anitha6@gmail.com");
		e2.setGender("female");
		e2.setSal(897456.75);
		
		Employee e3 = new Employee();
		e3.setEmpId(789);
		e3.setEmpName("Bala");
		e3.setEmpAddress("Coimbatore");
		e3.setEmpPhNum(9600632156l);
		e3.setDob("21/04/1992");
		e3.setDoj("20/08/2012");
		e3.seteMail("bala34@gmail.com");
		e3.setGender("male");
		e3.setSal(1234567.89);
		
		Employee e4 = new Employee();
		e4.setEmpId(321);
		e4.setEmpName("Raja");
		e4.setEmpAddress("Madurai");
		e4.setEmpPhNum(9566789123l);
		e4.setDob("29/08/1991");
		e4.setDoj("18/02/2012");
		e4.seteMail("raja143@gmail.com");
		e4.setGender("male");
		e4.setSal(1376545.90);
		
		Employee e5 = new Employee();
		e5.setEmpId(654);
		e5.setEmpName("Ravi");
		e5.setEmpAddress("Pondicherry");
		e5.setEmpPhNum(7824365876l);
		e5.setDob("12/02/1994");
		e5.setDoj("05/09/2015");
		e5.seteMail("ravi66@gmail.com");
		e5.setGender("male");
		e5.setSal(1135748.10);
		
	Map<Integer, Client> m = new LinkedHashMap<Integer, Client>();
		m.put(1, e1);
		m.put(2, e2);
		m.put(3, e3);
		m.put(4, e4);
		m.put(5, e5);
		
		Set<Map.Entry<Integer, Client>> s = m.entrySet();
		
		for (Map.Entry<Integer, Client> e : s) {
			System.out.println("\nEmployee "+e.getKey());
			System.out.println("Emp name:"+e.getValue().getEmpName());
			System.out.println("Emp Id:"+e.getValue().getEmpId());
			System.out.println("Emp address:"+e.getValue().getEmpAddress());
			System.out.println("Emp PhNum:"+e.getValue().getEmpPhNum());
			System.out.println("Emp DOB:"+e.getValue().getDob());
			System.out.println("Emp DOJ:"+e.getValue().getDoj());
			System.out.println("Emp email:"+e.getValue().geteMail());
			System.out.println("Emp gender:"+e.getValue().getGender());
			System.out.println("Emp salary:"+e.getValue().getSal());
		
		}
		
		
		
	}
}
		
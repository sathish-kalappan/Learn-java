package org.test;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Hello {
	 public static void main(String[] args) {
		  int[] keys = {10, 20, 30, 40, 50, 60, 10, 50, 40};
	        String[] values = {"java", "sql", "oops", "Sql", "oracle", "DB", "selenium", "psql", "Hadoop"};

	       
	        HashMap<Integer, String> map = new HashMap<>();

	       
	        for (int i = 0; i < keys.length; i++) {
	           
	            if (!map.containsKey(keys[i])) {
	                map.put(keys[i], values[i]);
	            }
	        }

	       
	        for (Map.Entry<Integer, String> entry : map.entrySet()) {
	            int key = entry.getKey();
	            String value = entry.getValue();
	            System.out.println("Key: " + key + ", Value: " + value);
	        }
	    }
	}
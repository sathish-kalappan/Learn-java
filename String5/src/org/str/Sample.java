package org.str;
import java.util.*;

public class Sample {
    public static void main(String[] args) {
List<Integer> list1 = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80);
List<Integer> list2 = Arrays.asList(100, 200, 300, 400, 500, 600, 700, 8000);

          Set<Integer> set1 = new TreeSet<>(list1);
          Set<Integer> set2 = new TreeSet<>(list2);

          // Perform removeAll() operation
          set1.removeAll(set2);

   System.out.println("Set1 after removeAll(set2): " + set1);
      }
  }
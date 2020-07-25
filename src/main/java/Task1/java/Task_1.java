package Task1.java;

import java.util.*;
import java.util.stream.IntStream;
public class Task_1{
   public static void main(String[] args) {
      IntStream intStream = IntStream.of(15, 13, 45, 18, 89, 70, 76, 56);
      OptionalDouble res = intStream.average();
      System.out.println("Average of the elements of the stream...");
      if (res.isPresent()) {
         System.out.println(res.getAsDouble());
      } else {
         System.out.println("No Output from the list");
      }
   }
}
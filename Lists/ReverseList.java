/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lists;
 import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author fbarasa
 */
public class ReverseList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        
        System.out.println("Original List: " + list);
        
        Collections.reverse(list);
        
        System.out.println("Reversed List: " + list);
    }
}
  

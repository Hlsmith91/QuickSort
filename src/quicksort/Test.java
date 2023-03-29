/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;




/**
 *
 * @author Heather
 */
public class Test {
    public static void main(String[] arg)
    {
        ArrayList<Integer> array = new ArrayList<>();
            File file = new File("1KInt.txt");
            //File file = new File("1KInts.txt");
            try {
                Scanner scan = new Scanner(file);
                while (scan.hasNextLine()) {   
                    int anInt = scan.nextInt();
                    array.add(anInt);
                }
                scan.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        System.out.println(array.toString());
        QuickSort.quickSort(array);
        
        System.out.println(array.toString());
        
    }


    
}

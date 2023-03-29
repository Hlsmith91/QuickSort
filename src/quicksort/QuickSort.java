/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/**
 *
 * @author Heather
 */
public class QuickSort {

    public static void quickSort(ArrayList<Integer> array) {
        Stack<Integer> stack = new Stack<>();
    
        stack.push(0);
        stack.push(array.size());

        while (!stack.isEmpty()) {
            int end = stack.pop();
            int start = stack.pop();
            System.out.println("Using  [start:" + start + "end:" + end + "]-------------------------");
            if (end - start < 2) {
                continue;
            }
            int p = start + ((end - start) / 2);
            p = partition(array, p, start, end);

            stack.push(p + 1);
            stack.push(end);

            stack.push(start);
            stack.push(p);
        }
    }

    private static int partition(ArrayList<Integer> arr, int p, int start, int end) {
        System.out.println("-->  Partition: " + p);
        int l = start;
        int h = end - 2;
        int piv = arr.get(p);
        swap(arr, p, end - 1);

        while (l < h) {
            if (arr.get(l) < piv) {
                l++;
            } else if (arr.get(h) >= piv) {
                h--;
            } else {
                swap(arr, l, h);
            }
        }
        int idx = h;
        if(arr.get(h) < piv)
        {
            idx++;
        }
        swap(arr, end-1, idx);
        return idx;
    }
    
    private static void swap(ArrayList<Integer> arr, int i, int j)
    {
        System.out.println("Swap " + i + " with " + j);
        int temp = arr.get(i);
        Collections.swap(arr, i, j);
        Collections.swap(arr, j, temp);
       
        
        
    }
}
   
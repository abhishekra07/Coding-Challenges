/*
Write a method that is getting 2 sorted arrays as input and returning the intersection between them

Examples:
ar1[] = {1, 5, 10, 20, 40, 80}
ar2[] = {6, 7, 20, 80, 100}
Output: 20, 80

ar2[] = {3, 4, 5, 5, 10}
ar3[] = {5, 5, 10, 20}
Output: 5, 5, 10
*/

import java.util.HashSet;

public class FindIntersection {

	public static void main(String[] args) {
		int ar1[] = {1, 5, 10, 20, 40, 80};
        int ar2[] = {6, 7, 20, 80, 100};
        int ar3[] = {3, 4, 5, 5, 10};
        int ar4[] = {5, 5, 10, 20};
        findIntersection(ar1, ar2);
        findIntersection(ar3, ar4);
        printIntersection(ar1, ar2);
        printIntersection(ar3, ar4);
	}
	
	public static void findIntersection(int ar1[], int ar2[]){
        int firstArrayIndex = 0, secondArrayIndex = 0;
        while (firstArrayIndex < ar1.length && secondArrayIndex < ar2.length) {
            if (ar1[firstArrayIndex] < ar2[secondArrayIndex]) // if first array element is smaller then move to next index in ar1
                firstArrayIndex++;
            else if (ar2[secondArrayIndex] < ar1[firstArrayIndex]) // if first array element is greater then second array then move second array index to next one
                secondArrayIndex++;
            else {
                // else block means we found the intersection between two arrays so print it and move both indexes to next position
                System.out.print(ar2[secondArrayIndex++] + " ");
                firstArrayIndex++;
            }
        }
        
        // time complexity for this approach will be O( ar1.length + ar2.length)
	}
	
	public static void printIntersection(int ar1[], int ar2[])
    {
        HashSet<Integer> set1 = new HashSet<>();
 
        for (int i = 0; i < ar1.length; i++)
        	set1.add(ar1[i]);
 
        for (int i = 0; i < ar2.length; i++)
            if (set1.contains(ar2[i])) // set contains method is constant time operation sp the overall time complexity will be O(n)
                System.out.print(ar2[i] + " ");
    }
}

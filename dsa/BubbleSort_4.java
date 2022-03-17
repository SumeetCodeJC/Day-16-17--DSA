package com.bridgelabz.dsa;

public class BubbleSort_4 {
    public static void main(String args[])	{
        BubbleSort_4 ob = new BubbleSort_4();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
    void bubbleSort(int arr[])	{
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])	{
                    int temp = arr[j];				// swap arr[j+1] and arr[j]
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
    void printArray(int arr[])	{						/* Prints the array */
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
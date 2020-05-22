package com.solvd.HelloWorld;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = {61, 44, 90, 23, 11, -5};
        mergeSort(array, 0, array.length);
    }

    public static void mergeSort(int[] array, int low, int high) {
        if (high <= low) return;

        int mid = (low + high) / 2;

        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);

        merge(array, low, mid, high);
    }

    public static void merge(int[] array, int low, int mid, int high) {

    int leftArray[] = new int[mid - low + 1];
    int rightArray[] = new int[high - mid];

        for (int i = 0; i < leftArray.length; i++)
            leftArray[i] = array[low + i];
        for (int i = 0; i < rightArray.length; i++)
            rightArray[i] = array[mid + i + 1];

        int leftIndex = 0;
        int rightIndex = 0;


        for (int i = low; i < high + 1; i++) {

            if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftArray.length) {

                array[i] = leftArray[leftIndex];
                leftIndex++;
            } else if (rightIndex < rightArray.length) {

                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }
    }
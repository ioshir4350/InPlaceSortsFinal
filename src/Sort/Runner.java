package Sort;

public class Runner {

    public static void main(String[] args) {

        int[] testArr = InPlaceSorts.randIntArr(4);
        String[] testArr1 = InPlaceSorts.randStringArr(4,4);
        double[] testArr2 = InPlaceSorts.randDoubleArr((4));

        int[] copy = InPlaceSorts.copyIntArray(testArr);
        double[] copy1 = InPlaceSorts.copyDoubleArray(testArr2);
        String[] copy2 = InPlaceSorts.copyStringArray(testArr1);

        System.out.print("Before: ");
        for (int num: testArr)
        {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Before: ");
        for (String num: testArr1)
        {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Before: ");
        for (double num: testArr2)
        {
            System.out.print(num + " ");
        }
        System.out.println();

        InPlaceSorts.InsertionSort(testArr);
        InPlaceSorts.bubbleSort(testArr1);
        InPlaceSorts.SelectionSort(testArr2);

        System.out.print("After: ");
        for (int num:testArr)
        {
            System.out.print(num+" ");
        }
        System.out.println();

        System.out.print("After: ");
        for (String num:testArr1)
        {
            System.out.print(num+" ");
        }
        System.out.println();

        System.out.print("After: ");
        for (double num:testArr2)
        {
            System.out.print(num+" ");
        }
        System.out.println();

        boolean isSortedVAR =  InPlaceSorts.isSorted(copy);
        System.out.println("Original testArr is sorted? " + isSortedVAR);

        boolean isSortedVAR1 =  InPlaceSorts.isSorted(testArr);
        System.out.println("New testArr is sorted? " + isSortedVAR1);

        boolean isSortedVAR3 =  InPlaceSorts.isSorted(copy1);
        System.out.println("Original testArr2 is sorted? " + isSortedVAR3);

        boolean isSortedVAR4 =  InPlaceSorts.isSorted(testArr2);
        System.out.println("New testArr2 is sorted? " + isSortedVAR4);

        boolean isSortedVAR5 =  InPlaceSorts.isSorted(copy2);
        System.out.println("Original testArr1 is sorted? " + isSortedVAR5);

        boolean isSortedVAR6 =  InPlaceSorts.isSorted(testArr1);
        System.out.println("New testArr1 is sorted? " + isSortedVAR6);

        boolean isCheckedVAR = InPlaceSorts.checkSum(copy,testArr);
        System.out.println("Original testArr and new testArr have the same sum? " + isCheckedVAR);

        boolean isCheckedVAR1 = InPlaceSorts.checkSum(copy1,testArr2);
        System.out.println("Original testArr2 and new testArr2 have the same sum? " + isCheckedVAR1);

        long time = System.nanoTime();
        InPlaceSorts.InsertionSort(testArr);
        time = System.nanoTime() - time;
        System.out.println("Time Taken for InsertionSort: " + time);

        long time2 = System.nanoTime();
        InPlaceSorts.bubbleSort(testArr1);
        time2 = System.nanoTime() - time2;
        System.out.println("Time Taken for BubbleSort: " + time2);

        long time3 = System.nanoTime();
        InPlaceSorts.SelectionSort(testArr2);
        time3 = System.nanoTime() - time3;
        System.out.println("Time Taken for SelectionSort: " + time3);
    }
}

package Sort;

public class InPlaceSorts {

    public static int[] randIntArr(int count) {
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = (int) (Math.random() * 10001);
        }
        return arr;
    }

    public static double[] randDoubleArr(int count) {
        double[] arr = new double[count];
        for (int i = 0; i < count; i++) {
            arr[i] = (Math.random() * 10001);
        }
        return arr;
    }

    public static String[] randStringArr(int num, int length) {
        String[] arr = new String[num];
        while (num > 0) {
            String s = "";
            for (int i = 0; i < length; i++) {
                char c = (char) ((Math.random() * 26) + 97);
                s = s + c;
            }
            num--;
            arr[num] = s;
        }
        return arr;
    }

    public static void swap(int[] testarr, int i, int j) {
        int x = testarr[i];
        testarr[i] = testarr[j];
        testarr[j] = x;
    }
    public static void swap(String[] testarr, int i, int j)
    {
        String x = testarr[i];
        testarr[i] = testarr[j];
        testarr[j] = x;
    }
    public static void swap(double[] testarr, int i, int j)
    {
        double x = testarr[i];
        testarr[i] = testarr[j];
        testarr[j] = x;
    }

    public static void bubbleSort(String[] list1) {
        int c = 1;
        while (c > 0) {
            c = 0;
            for (int b = 0; b < list1.length - 1; b++) {
                if (list1[b].compareTo(list1[b + 1]) > 1) {
                    swap(list1, b, b + 1);
                    c++;
                }
            }
        }
    }

    public static boolean isSorted(int[] arr) {
        for (int b = 0; b < arr.length - 1; b++) {
            if (arr[b] > arr[b + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(double[] arr) {
        for (int b = 0; b < arr.length - 1; b++) {
            if (arr[b] > arr[b + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(String[] arr) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].compareTo(arr[i]) > 0) {
                return false;
            }
        }
        return true;
    }


    public static boolean checkSum(int[] before, int[] after) {
        int beforesum = 0;
        int aftersum = 0;
        for (int b = 0; b < before.length; b++) {    //not before.length -1 because that actually doesn't include the last value
            beforesum = beforesum + before[b];
        }
        for (int a = 0; a < after.length; a++) {
            aftersum = aftersum + after[a];
        }
        if (aftersum == beforesum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean checkSum(double[] before, double[] after) {
        double beforesum = 0;
        double aftersum = 0;
        for (int b = 0; b < before.length; b++) {    //not before.length -1 because that actually doesn't include the last value
            beforesum = beforesum + before[b];
        }
        for (int a = 0; a < after.length; a++) {
            aftersum = aftersum + after[a];
        }
        if (aftersum == beforesum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static int minimum(double[] arr, int index) {
        int minInd = index;
        for (int i = index; i < arr.length; i++) {
            if (arr[i] < arr[minInd]) {
                minInd = i;
            }
        }
        return minInd;
    }

    public static void SelectionSort(double[] list1)
    {
        for (int a = 0; a < list1.length; a++)
        {
            swap(list1, a, minimum(list1, a));
        }
    }

    public static void InsertionSort(int[] list1)
    {
        for (int i = 1; i < list1.length; i++)
        {
            for(int j = i; j > 0; j--)
            {
                if(list1[j-1] > list1[j])
                {
                    swap(list1, j-1, j);
                }
                else
                {
                    j = 0;
                }
            }
        }
    }

    public static int[] copyIntArray(int[] testarr)
    {
        int [] copy = new int[testarr.length];
        for(int i = 0; i < testarr.length; i++)
        {
            copy[i] = testarr[i];
        }
        return copy;
    }

    public static double[] copyDoubleArray(double[] testarr)
    {
        double [] copy = new double[testarr.length];
        for(int i = 0; i < testarr.length; i++)
        {
            copy[i] = testarr[i];
        }
        return copy;
    }

    public static String[] copyStringArray(String[] testarr)
    {
        String [] copy = new String[testarr.length];
        for(int i = 0; i < testarr.length; i++)
        {
            copy[i] = testarr[i];
        }
        return copy;
    }

}
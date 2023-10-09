public class InsertionSorting {

    public static void insertionsorting(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            int currpos = arr[i];
            int prevpos = i - 1;
            // Find out current position
            while (prevpos >= 0 && arr[prevpos] > currpos) {
                arr[prevpos + 1] = arr[prevpos];
                prevpos--;
            }
            arr[prevpos + 1] = currpos;

        }
    }

    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 5, 68, 1, 2, 3, 5 };
        insertionsorting(arr);
        printarray(arr);
    }
}

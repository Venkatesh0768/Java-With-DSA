public class SelectionSorting {

    public static void selectionsorting(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int Minpos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[Minpos] > arr[j]) {
                    Minpos = j;
                }
            }
            int temp = arr[Minpos];
            arr[Minpos] = arr[i];
            arr[i] = temp;

        }
    }

    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 5, 68, 1, 2, 3, 5 };
        selectionsorting(arr);
        printarray(arr);
    }

}

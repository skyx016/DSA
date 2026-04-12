import java.util.Scanner;

public class missingNumber_02 {
    public static void missingNumber(int[] nums) {
        int n = nums.length;
        int TotalSum = n * (n + 1) / 2;

        int Realsum = 0;
        for (int element : nums) {
            Realsum = Realsum + element;
        }
        System.out.println("Missing number : " + (TotalSum - Realsum));
    }
        static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println(" Array Size : ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            missingNumber(arr);
        }

}
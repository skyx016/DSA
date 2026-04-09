/*
public class missingNumber {
    static void main(String[] args) {
        int [] arr = {1,2,4,5,6,7 };
        int n = 0;
        for (int  element : arr){
             n = n + element;
        }
        System.out.println(n);

    }
}


 */
public class missingNumber {
    static void main(String[] args) {


                int[] arr = {1, 3, 4, 5, 6};

                for (int i = 1; i <= 6; i++) {

                    boolean found = false;

                    for (int j = 0; j < arr.length; j++) {
                        if (arr[j] == i) {
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Missing number is: " + i);
                    }
                }
            }
        }

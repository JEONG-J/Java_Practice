package Pratice_video;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = new int[5];

        System.arraycopy(arr1, 0, arr2, 0, arr1.length);

        for(int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}

package de004;

public class Bai03 {
    public void findSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("Không tồn tại số lớn thứ nhì");
        } else {
            System.out.println("Max: " + max + ", Second: " + secondMax);
        }
    }
}

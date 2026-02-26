package de004;

public class Bai04 {
    public static int maxSubArray(int[] nums) {
        // Khởi tạo bằng phần tử đầu tiên thay vì số 0 để xử lý mảng toàn số âm
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Nếu currentSum âm, bắt đầu dãy mới từ nums[i]
            // Ngược lại, cộng thêm nums[i] vào dãy hiện tại
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Cập nhật kỷ lục tổng lớn nhất
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}

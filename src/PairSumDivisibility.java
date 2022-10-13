import java.util.*;

public class PairSumDivisibility {

	public static boolean canPair(int[] nums, int k) {
		if (nums.length % 2 != 0) {
			return false;
		}
		int rem[] = new int[k];
		for (int i = 0; i < nums.length; i++) {
			rem[nums[i] % k]++;
		}
		if (rem[0] % 2 != 0) {
			return false;
		}
		int mid = k / 2;
		if (k % 2 == 0) {
			if (rem[mid] % 2 != 0) {
				return false;
			}
			mid--;
		}
		for (int i = 1; i <= mid; i++) {
			if (rem[i] != rem[k - i])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int arr[] = { 13, 11, 9, 3, 7, 1 };
		int k = 4;
		System.out.println(canPair(arr, k));
	}

}

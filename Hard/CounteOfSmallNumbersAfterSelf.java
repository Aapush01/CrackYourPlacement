//315. Count of Smaller Numbers After Self
import java.util.*;

public class CounteOfSmallNumbersAfterSelf{
    public List<Integer> countSmaller(int[] nums) {
      int n = nums.length;
      Integer[] result = new Integer[n];
      int[] indexes = new int[n];
      
      for (int i = 0; i < n; i++) {
          indexes[i] = i;
          result[i] = 0;
      }
      
      mergeSort(nums, indexes, result, 0, n - 1);
      return Arrays.asList(result);
  }

  private void mergeSort(int[] nums, int[] indexes, Integer[] result, int left, int right) {
      if (left >= right) {
          return;
      }
      
      int mid = (left + right) / 2;
      mergeSort(nums, indexes, result, left, mid);
      mergeSort(nums, indexes, result, mid + 1, right);
      
      merge(nums, indexes, result, left, right);
  }

  private void merge(int[] nums, int[] indexes, Integer[] result, int left, int right) {
      int mid = (left + right) / 2;
      int leftIndex = left;
      int rightIndex = mid + 1;
      int rightCount = 0;
      int[] newIndexes = new int[right - left + 1];
      
      int sortIndex = 0;
      while (leftIndex <= mid && rightIndex <= right) {
          if (nums[indexes[rightIndex]] < nums[indexes[leftIndex]]) {
              newIndexes[sortIndex] = indexes[rightIndex];
              rightCount++;
              rightIndex++;
          } else {
              newIndexes[sortIndex] = indexes[leftIndex];
              result[indexes[leftIndex]] += rightCount;
              leftIndex++;
          }
          sortIndex++;
      }
      
      while (leftIndex <= mid) {
          newIndexes[sortIndex] = indexes[leftIndex];
          result[indexes[leftIndex]] += rightCount;
          leftIndex++;
          sortIndex++;
      }
      
      while (rightIndex <= right) {
          newIndexes[sortIndex] = indexes[rightIndex];
          rightIndex++;
          sortIndex++;
      }
      
      System.arraycopy(newIndexes, 0, indexes, left, newIndexes.length);
  }
    public static void main(String[] args) {

    }
}
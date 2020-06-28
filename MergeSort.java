import java.util.Arrays;

public class MergeSort {

  public static void main(String[] args) {
    int[] arr = {3,2,4,1};
    mergeSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  public static void mergeSort(int[] arr) {
    if (arr == null || arr.length < 1) {
      return;
    }
    final int len = arr.length;
    int[] temp = new int[len];
    mergeSort(arr, 0, len - 1, temp);
  }

  private static void mergeSort(int[] arr, int start, int end, int[] temp) {
    if (start >= end) {
      return;
    }
    int mid = start + (end - start) / 2;
    mergeSort(arr, start, mid, temp);
    mergeSort(arr, mid + 1, end, temp);
    merge(arr, start, mid, end, temp);
  }

  private static void merge(int[] arr, int start, int mid, int end, int[] temp) {
    for (int k = start; k <= end; k++) {
      temp[k] = arr[k];
    }
    int i = start, j = mid + 1, k = start;
    while (i <= mid && j <= end) {
      if (temp[i] < temp[j]) {
        arr[k++] = temp[i++];
      } else {
        arr[k++] = temp[j++];
      }
    }
    while (i <= mid) {
      arr[k++] = temp[i++];
    }
    while (j <= end) {
      arr[k++] = temp[j++];
    }
  }
}

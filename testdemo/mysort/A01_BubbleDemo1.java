public class A01_BubbleDemo1 {
    public static void main(String[] args) {
        /*
        冒泡排序：
        核心思想：
        1，相鄰的元素兩兩比較，大的放右邊，小的放左邊。
        2，第一輪比較完畢之後，最大值就己經確定，第二輪可以少循環一次，後面以此類推。
        3，如果數組中有n個數據，總共我們只要執行n-1輪的代碼就可以。
         */

        int [] arr = {2, 4, 5, 3, 1};
        // 外循環：表示要執行多少輪，如果有n個數據，那麼執行 n - 1 輪
        for (int i = 0; i < arr.length - 1; i++) {
            // 內循環：每一輪中如何比較數據並找到當前的最大值
            // -1：為了防止索引越界
            // -i：提高效率，每一輪執行的次數應該比上一次少一次
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

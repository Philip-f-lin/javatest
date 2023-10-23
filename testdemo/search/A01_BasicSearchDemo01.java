public class A01_BasicSearchDemo01 {
    public static void main(String[] args) {
        //基本查找

        //需求：定义一个方法利用基本查找，查询某个元素是否存在
        //陣列如下：{131, 127, 147, 81, 103, 23, 7, 79}

        int [] arr = {131, 127, 147, 81, 103, 23, 7, 79};
        int number = 82;
        System.out.println(basicSearch(arr, number));

    }

    public static Boolean basicSearch(int [] arr, int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                return true;
            }
        }
        return false;
    }
}

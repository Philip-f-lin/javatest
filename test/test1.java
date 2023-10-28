import java.util.Arrays;
import java.util.Comparator;

public class test1 {
    public static void main(String[] args) {
        /*定義陣列並儲存一些女朋友對象，利用Arrays中的sort方法進行排序
        要求1：屬性有姓名、年齡、身高。
        要求2：依照年齡的大小進行排序，年齡一樣，依照身高排序，身高一樣依照姓名的字丹進行排序。
       〔姓名中不要有中文或特殊字符，會涉及到後面的知識〉*/

        GirlFriend gf1 = new GirlFriend("xiaoshishi", 18, 1.67);
        GirlFriend gf2 = new GirlFriend("xiaodandan", 19, 1.72);
        GirlFriend gf3 = new GirlFriend("abc", 19, 1.78);

        GirlFriend [] arr = {gf1, gf2, gf3};
        System.out.println(Arrays.toString(arr));

        /*Arrays.sort(arr, new Comparator<GirlFriend>() {
            @Override
            public int compare(GirlFriend o1, GirlFriend o2) {
                double temp = o1.getAge() - o2.getAge();
                temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;

                if (temp > 0){
                    return 1;
                }else if(temp < 0){
                    return -1;
                } else{
                    return 0;
                }
            }
        });*/

        // lambda
        Arrays.sort(arr,(o1, o2) -> {
                double temp = o1.getAge() - o2.getAge();
                temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;

                if (temp > 0){
                    return 1;
                }else if(temp < 0){
                    return -1;
                } else{
                    return 0;
                }
        });
    }
}



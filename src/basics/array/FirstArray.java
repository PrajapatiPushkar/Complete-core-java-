package src.basics.array;

public class FirstArray {
    public static void main(String[] args) {
//        int[] myArr = new int[5];
//        myArr[0] = 98;
//        myArr[1] = 65;
//        myArr[2] = 8;
//        myArr[3] = 48;
//        myArr[4] = 48;

        int[] myArr = {98, 65, 8, 48, 48};
//        int index = 2;
//
//        System.out.println(myArr[0]);
//        System.out.println(myArr[1]);
//        System.out.println(myArr[index]);
//        System.out.println(myArr[3]);
//        System.out.println(myArr[4]);

        int index = 0;
        while (index < myArr.length) {
            System.out.println(myArr[index]);
            index++;
        }


    }
}

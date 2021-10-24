package org.example.doc.collect;

/**
 * @author lihaiming
 * @version 1.0.0
 * @since 2021/3/30 20:35
 **/
public class ListTest {

    public static void bubble(Integer[] array) {
        if (array == null) {
            return;
        }
        int temp = 0;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1,7,2,6,2,5,4,6,8,4,1};
        bubble(array);
    }

}

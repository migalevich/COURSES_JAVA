package threadsTest.CopyOnWrite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestCopyOnWrite {
    public static void main(String[] args) {
        List<Integer> list1 = Collections.synchronizedList(new ArrayList<Integer>());
        List<Integer> list2 = new CopyOnWriteArrayList<Integer>();
        fillList(list1,100);
        fillList(list2,100);

        System.out.println("List synchronized:");
        checkList(list1);

        System.out.println("CopyOnWriteArrayList:");
        checkList(list2);

    }


    public static void fillList(List<Integer> list, int i) {
        for (int j = 0; j <= i; j++) {
            list.add(j);
        }
    }

    public static void  checkList(List<Integer> list){
        CountDownLatch latch = new CountDownLatch(1);

        ExecutorService ex = Executors.newFixedThreadPool(2);


    };


}

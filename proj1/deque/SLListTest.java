package deque;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


public class SLListTest {

@Test
    public  void TestInsert(){
     SLList sl=new SLList();
     sl.addFirst(666);
    sl.addFirst(555);
    sl.addFirst(444);
    sl.insert(777,3);
    sl.reverse2();
    for (int i = 0; i < sl.size; i++) {
        System.out.println(sl.getValue(i));
    }
//    Assert.assertEquals(666,sl.getValue(1));


    }

    public static void main(String[] args) {
        String x="THis is a test";
        testString(x);

        System.out.println(x);
    }

   static void testString(String x){

    x="55555";

    }

}

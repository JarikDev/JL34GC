import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
  /*      Date dt = method2();
        dt = null;
        System.gc();*/
        method();


    }

    private static void method() {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("total memory before " + runtime.totalMemory());
        System.out.println("free memory before " + runtime.freeMemory());
        List<Date> dateList=new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            Date date = new Date();
            dateList.add(date);
         //   date = null;

        }
        System.out.println("total memory after " + runtime.totalMemory());
        System.out.println("free memory after " + runtime.freeMemory());
        System.gc();
        System.out.println("total memory after GC " + runtime.totalMemory());
        System.out.println("free memory after GC " + runtime.freeMemory());
    }

    private static Date method2() {

        Date date = new Date();
        Date date2 = date;
        System.out.println(date);
        return date;
    }
}
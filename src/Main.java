public class Main {

    public static void main(String[] args) {

        int [] myInteger = SortedArray.getIntegers(6);
        int [] sorted = SortedArray.sortIntegers(myInteger);
        SortedArray.printArray(sorted);


//        int a[]=new int[]{1,2,3,4,5};
//        System.out.println(a[5]);

//        String s1="jaVatpoint";
//        System.out.println(s1.substring(2,4));
//        System.out.println(s1.substring(2));

//        Cricketer cricketer1 = new Cricketer();
//        Cricketer cricketer2 = new Cricketer();
//        Cricketer cricketer3 = new Cricketer();
//        Cricketer cricketer4 = new Cricketer();
//
//        System.out.println(Cricketer.getCount());
    }

    private static void method1a() {
        int value = 5;
        int result = 0;

        try {
            for (int i=0; i < 10; i = i+5) {
                if (i > 6) {value++; result=1; break;}
                if (i > 4) {value++; result=2; break;}
                if (i > 2) {value++; result=3; break;}
            }
            System.out.println(value);
            System.out.println(result);
        }catch (Exception e) {
            System.out.println("Error");
        }
        System.out.println("Done");
    }

    private static void method1b() {
        String s1 = "NC";
        String s2 = "S";

        try {
            if (s1 + s2 == "NCS") {
                System.out.println("Hello");
            }else {
                System.out.println("World");
            }
        }catch (Exception e) {
            System.out.println("Error");
        }
    }

    private static void method2a() {
        String[] items = new String[2];
        items[0] = "Hello";
        items[1] = "World";

        try {
            for (int i=0; i <= 2; i++) {
                System.out.println(items[i]);
            }
        }catch (Exception e) {
            System.out.println("Error");
        }
    }

    private static void method3a() {
        try {
            int value = 5;
            method3b(value);
            System.out.println(value);
        }catch (Exception e) {
            System.out.println("Error");
        }
    }

    private static int method3b(int value) {
        value++;
        value = value + 5;
        return value;
    }

    private static void method4a() {
        try {
            TempItem item = new TempItem(5);
            method4b(item);
            System.out.println(item.getValue());
        }catch (Exception e) {
            System.out.println("Error");
        }
    }

    private static TempItem method4b(TempItem item) {
        item.setValue(4);
        return new TempItem(3);
    }


}

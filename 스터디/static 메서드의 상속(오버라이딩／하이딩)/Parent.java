public class Parent {
    static int count = 999;

    static void doIt() {        // 하이딩
        System.out.println("Parent.doIt");
    }

    void doThat() {             // 오버라이딩
        System.out.println("Parent.doThat");
    }
}
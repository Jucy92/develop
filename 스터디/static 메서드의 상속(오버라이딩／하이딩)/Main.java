import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Parent p = new Parent();        // 런타임 말고 컴파일 시 클래스를 따라 간다. => p의 정적 메소드
        p.doIt();
        p.doThat();
        System.out.println("p.count = " + p.count);

        Child c = new Child();        // 런타임 말고 컴파일 시 클래스를 따라 간다. => c의 정적 메소드
        c.doIt();
        c.doThat();
        System.out.println("c.count = " + c.count);


        Parent pc = new Child();        // 런타임 말고 컴파일 시 클래스를 따라 간다. => p의 정적 메소드 출력
        pc.doIt();
        pc.doThat();
        System.out.println("pc.count = " + pc.count);

    }
}
package Chap04;

public class VariableTypes {
    int instanceVariable; // 메소드 밖에, 클래스 안에 선언된 변수 + 앞에 static 예약어 없음
    static int classVariable; // 인스턴스 변수처럼 메소드 밖에, 클래스 안에 선언된 변수 + 타입 선언 앞에 static이라는 예약어가 있는 변수
    public void method(int parameter) { // 메소드에 넘겨주는 변수
        int localVarialbe; // 중괄호 내에서 선언된 변수
    }
}

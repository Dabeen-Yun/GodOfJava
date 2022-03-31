# Chap 04
## 변수
<br/>

### 1. Variable 변수
: 담아두는 것  
: 항상 이름을 정해주어야 함

#### 변수 종류
    public class VariableTypes {  
        int instanceVariable;  //인스턴스변수: 객체가 생성될 때 생명 시작, 객체를 참조하고 있는 다른 객체가 없으면 소멸
        static int classVariable;  //클래스변수: 클래스가 처음 호출될 대 생명이 시작, 자바 프로그램이 끝나면 소멸
        public void method(int parameter) {  //매개변수: 메소드가 호출될 때 생명이 시작, 메소드가 끝나면 소멸
            int localVariabe;  //지역변수: 지역변수를 선언한 중괄호 내에서만 유효
        }
    }

### 2. 자료형
1) 기본자료형 (Primitive data type)  
    : 마음대로 추가할 수 없음.  
    : new 예약어 없이 바로 값을 저거 초기화함
2) 참조자료형 (Reference data type)  
    : 마음대로 만들 수 있음.  
    : new를 사용해서 초기화함
3) 특이케이스  
    : String 자료형은 참조 자료형이지만, new 없이 기본자료형처럼 초기화 가능  
    : String bookName1 = "God Of Java"; === String bookName2 = new String("God Of Java");

### 3. 기본 자료형
1) 정수형 : byte, short, int, long, char
2) 소수형 : float, double
3) 기타 : boolean

### 4. byte 타입
: byte는 8비트의 부호가 있는 (signed) 타입  
: 0과 1로 표현할 수 있는 공간이 8개가 있음  
: 8비트 = 1바이트  
: 8비트를 표현할 때 맨 왼쪽 공간은 2^7의 수가 아닌, 양수/음수를 판별하는 공간  
: 
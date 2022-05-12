# Chap 08
## 참조자료형
<br/>

### 1. 생성자
: 자바의 생성자는 자바 클래스의 객체(인스턴스)를 생성하기 위해 존재  
: 선언부에 리턴 타입이 없고, 메소드 이름 대신 클래스 이름과 동일하게 이름을 지정  
: 생성자의 리턴 타입은 클래스의 객체이기 때문에 리턴 타입을 지정?해놓지 않음   

    public class Reference {
        String instanceVariable; -> 인스턴스 변수
        public ReferenceString() {}
        public ReferenceString(String arg) {} => 생성자 영역
        
        public static void main(String args[]){
            ReferenceString reference = new ReferenceString();
        }
        public String getString() {
            return instanceVariable;
        }
        public void setString(String str){
            instanceVariable = str;
        }
    } => 메소드 영역

### 2. 예약어 this
: 객체의 변수와 매개 변수의 이름이 동일할 때, 인스턴스의 변수를 구분하기 위해서 사용  

### 3. 메소드 overloading
: 메소드의 이름을 같도록하고, 매개 변수만을 다르게 하는 것  
: 클래스의 생성자와 메소드는 매개 변수들을 서로 다르게 하여 선언할 수 있다. (이름 같을 수 있음)  
: 매개변수의 종류와 개수가 같아서 순서가 다르면 다른 메소드로 인식됨

### 4. Static메소드와 일반메소드의 차이
: static은 객체를 생성하지 않아도 메소드를 호출할 수 있는 메소드  
: 클래스 변수에서만 사용할 수 있다.

### 5. static 블록
: 객체는 여러 개를 생성하지만, 한 번만 호출되어야 하는 코드가 있다면 "static 블록"을 사용  

    static {
        //딱 한 번만 수행되는 코드
    }

: 이 static 블록은 객체가 생성되기 전에 한 번만 호출되고, 이후에는 호출하려고 해도 호출할 수가 없음  
: 클래스 내에 선언되어 있어야 하며, 메소드 내에서는 선언할 수 없음  
=> 인스턴스 변수나 클래스 변수와 같이 어떤 메소드나 생성자에 속해있으면 안됨  

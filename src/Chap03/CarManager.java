package Chap03;


public class CarManager {
    public static void main(String args[]){
        Car dogCar=new Car(); //new라는 예약어를 통해 생성자인 Car() 호출 -> 새로운 객체 생성
        dogCar.speedUp(); //객체.메소드 형식을 통해 메소드 호출
        dogCar.speedUp();
        System.out.println(dogCar.getCurrentSpeed());
        dogCar.breakDown();
        System.out.println(dogCar.getCurrentSpeed());
    }
}

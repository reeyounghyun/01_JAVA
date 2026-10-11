package exercise.problem01;

import lecture.section01.method.Application1;

// Answer 클래스 영역: 매서드를 만들때
public class Answer {

    //main 매서드 영역: 매서드를 호출할때 변수 선언/객체 생성/ 출력할 때
    static void main(String[] args) {
        /*
        chap03 method_and_api 연습문제*
        각 문제는 별도의 problemNN 패키지와 main 메서드를 가진 Answer 클래스에서 해결한다.
        문제에서 지정한 메서드 이름, 매개변수, 반환 타입과 호출 방법을 지킨다.
        먼저 실행 결과를 예상한 뒤 코드를 작성하고 실행한다.*/
            /*
        문제 1. 온라인 주문 출고 처리*
        problem01 패키지의 Answer 클래스 main 메서드에서 "출고 처리 시작"을 출력한다.
        Answer 타입의 orderManager 객체를 생성한다.
        매개변수와 반환값이 없는 non-static 메서드 verifyPayment, packOrder,
        handOverToCourier를 작성하고, 각 메서드에서 담당 업무의 완료 메시지를 출력한다.
        orderManager 객체로 세 메서드를 업무 순서대로 호출한다.
        모든 메서드의 호출이 끝나면 main 메서드에서 "출고 처리 종료"를 출력한다.*
        실행 결과
        출고 처리 시작
        결제를 확인했습니다.
        상품 포장을 완료했습니다.
        택배사에 상품을 인계했습니다.
        출고 처리 종료*/

        // 1.problem01 패키지의 Answer 클래스 main 메서드에서 "출고 처리 시작"을 출력한다.
        System.out.println("출고 처리 시작");

        // 2.Answer 타입의 orderManager 객체를 생성한다.
        Answer orderManager = new Answer();
        System.out.println(orderManager);

        // 3.매개변수와 반환값이 없는 non-static 메서드 verifyPayment, packOrder,
        //   handOverToCourier를 작성하고, 각 메서드에서 담당 업무의 완료 메시지를 출력한다.
        orderManager.verifyPayment();
        orderManager.packOrder();
        orderManager.handOverToCourier();
        System.out.println("출고 처리 종료");
    } // 메인 메서드 종료

    //Answer 클래스 시작
        public void verifyPayment(){
            System.out.println("결제를 확인했습니다.");
        }
        public void packOrder(){
            System.out.println("상품 포장을 완료했습니다.");
        }
        public void handOverToCourier(){
            System.out.println("택배사에 상품을 인계했습니다.");
        }
}


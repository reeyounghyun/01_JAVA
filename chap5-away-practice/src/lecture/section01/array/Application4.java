package lecture.section01.array;

public class Application4 {
    public static void main(String[] args) {
        /*
         *
         *
         *String 배열로 만들기
         * */
        String[] shapes = {"SPADE", "CLOVER", "HEAR", "DIAMOND"};
        String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

        System.out.println("shapes = " + shapes[0]);
        System.out.println("cardNumbers = " + cardNumbers[0]);

        //Math 난수(무작위 숫자) 발생시키는 random()함수로 뽑은 카드를 출혁해보자.

        //System.out.println((int)Math.random()*5);
        int randomShape = (int) (Math.random() * shapes.length);
        int radomCardNumbers = (int) (Math.random() * cardNumbers.length);

        System.out.println(Math.random());

        System.out.println("당신이 뽑은 카드는 " + shapes[randomShape] + " " + cardNumbers[radomCardNumbers] + " 카드 입니다.");

    }
}


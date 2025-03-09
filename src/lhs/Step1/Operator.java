package lhs.Step1;

public class Operator {
    public static void main(String[] args){
        int mathScore=90;
        int engScore=70;
        int KorScore=85;

        int totalScore= mathScore +  engScore + KorScore;
        System.out.println(totalScore);

        double avgScore = (double)totalScore/3;
        System.out.println(avgScore);
//자바 프로그래밍 입문 74p 1분 복습 문제
    }
}

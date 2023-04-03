package top.xiwangly.test;

import java.util.Scanner;
public class HelloAccp2 {
    public static void main(String[ ] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("输入令狐冲的Java成绩: ");
        int score =  input.nextInt();    //令狐冲的Java成绩
        if ( score > 90 ) {    //判断是否大于90分
            System.out.println("师父说:不错，给你《独孤九剑》剑谱");
        }
    }
}

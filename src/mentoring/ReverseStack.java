package mentoring;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");//GETTING THE NUMBERS

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < input.length; i++) {
            stack.push(Integer.parseInt(input[i]));//PUSHING THEM INTO THE STACK
        }

        Collections.reverse(stack);//SINCE STACK IS A SUBCLASS OF COLLECTIONS, WE CAN USE COLLECTIONS' REVERSE METHOD TO REVERSE THE NUMBERS

        for (Integer integer : stack) {
            System.out.print(integer + " ");//PRINTING THE REVERSE ORDER OF THE NUMBERS
        }
    }
}
package com.gtxc.practice.hackerrank;

/*
    Created by gt at 4:35 PM on Monday, February 14, 2022.
    Project: practice, Package: com.gtxc.practice.hackerrank.
*/

import java.util.Scanner;
import java.util.Stack;

public class BalancedString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
                {}()
                ({()})
                {}(
                []
        */

        while (sc.hasNext()) {
            String input = sc.next();
            // Complete the code

            if (input.length() % 2 == 1) {
                System.out.println("false");
                continue;
            }

            Stack<Character> characterStack = new Stack<>();
            String result = "true";

            for (char c : input.toCharArray()) {
                if (c == '(' || c == '[' || c == '{') {
                    characterStack.push(c);
                } else {
                    char stackpop = '\0';
                    if (!characterStack.isEmpty()) {
                        stackpop = characterStack.pop();
                    }
                    if (c == ')') {
                        if (stackpop != '(') {
                            result = "false";
                            break;
                        }
                    } else if (c == ']') {
                        if (stackpop != '[') {
                            result = "false";
                            break;
                        }
                    } else if (c == '}') {
                        if (stackpop != '{') {
                            result = "false";
                            break;
                        }
                    }
                }
            }
            System.out.println(result);
        }
    }
}


/*
({}[])
(({()})))
({(){}()})()({(){}()})(){()}
{}()))(()()({}}{}
}}}}
))))
{{{
(((
[]{}(){()}((())){{{}}}{()()}{{}{}}
[[]][][]
}{

 */
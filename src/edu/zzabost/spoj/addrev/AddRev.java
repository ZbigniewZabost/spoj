package edu.zzabost.spoj.addrev;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Solution for ADDREV problem from Sphere Online Judge (SPOJ)
 * http://www.spoj.com/problems/ADDREV/
 *
 * User: Zbigniew Zabost
 * Date: 4/24/13
 */
public class AddRev {

    public static void main (String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Integer numberOfLines = Integer.valueOf(input.nextLine());
        List<Integer> resutls = new ArrayList<Integer>();
        for (int i=0; i<numberOfLines; i++) {
            final String line = input.nextLine();
            String[] splitLine = line.split(" ");
            resutls.add(addRev(splitLine[0], splitLine[1]));
        }

        for(Integer number : resutls) {
            System.out.println(number);
        }

        return;
    }

    public static Integer addRev(String number1, String number2) {
        Integer revNumber1 = reversNumber(number1);
        Integer revNumber2 = reversNumber(number2);
        Integer sum = revNumber1 + revNumber2;
        Integer revSum = reversNumber(sum.toString());
        return revSum;
    }

    public static Integer reversNumber(String number) {
        String newNumber = "";
        boolean isTrailingZero = true;
        for (int i = number.length()-1; i>=0; i--) {
            if (number.charAt(i) == '0' && isTrailingZero) {
                continue;
            } else {
                isTrailingZero = false;
            }
            newNumber = newNumber + number.charAt(i);
        }
        if (newNumber.isEmpty()) {
            newNumber += '0';
        }
        return Integer.valueOf(newNumber);
    }
}


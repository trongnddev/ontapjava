/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ontapjava;

import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author ndt05
 */
public class Person {
    public static void main(String[] args) {
         String text1 = "0123a4";
        String text2 = "01234";

        boolean result1 = StringUtils.isNumeric(text1);
        boolean result2 = StringUtils.isNumeric(text2);

        System.out.println(text1 + " is a numeric? " + result1);
        System.out.println(text2 + " is a numeric? " + result2);

    }
}

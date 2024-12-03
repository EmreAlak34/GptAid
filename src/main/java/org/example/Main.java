package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Test reverseString method
        System.out.println(StringUtils.reverseString("Hello"));  // Output: "olleH"

        // Test isPalindrome method
        System.out.println(StringUtils.isPalindrome("anna"));  // Output: true
        System.out.println(StringUtils.isPalindrome("hello"));  // Output: false

        // Test generatePrimes method
        int[] primes = StringUtils.generatePrimes(5);
        for (int prime : primes) {
            System.out.println(prime);  // Output: 2, 3, 5, 7, 11
        }
    }
}

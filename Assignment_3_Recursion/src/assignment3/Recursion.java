/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author Ants
 */
public class Recursion
{

    //Power Function
    public int power(int base, int exponent)
    {
        if (exponent == 0)
        {
            return 1;
        } else
        {
            return base * (power(base, exponent - 1));
        }
    }

    //GCD Function
    int gcd;

    public int gcd(int one, int two)
    {
        if (two == 0)
        {
            return one;
        } else
        {
            return gcd = gcd(two, one % two);

        }
    }

    //Factorial Function
    public int factorial(int number)
    {
        if (number == 0)
        {
            return 1;
        } else
        {
            return number * factorial(number - 1);
        }
    }

    //Place Function
    public int place(int number, int con)
    {
        if (number == 0)
        {
            return con;
        } else
        {
            return place(number / 10, con * 10);
        }
    }

    //Palindrome Check Function
    public static boolean checkP1(char[] word)
    {
        return checkP2(word, 0, word.length - 1);
    }

    public static boolean checkP2(char[] word, int start, int end)
    {
        if (start >= end)
        {
            return true;
        } else if (word[start] == word[end])
        {
            return checkP2(word, start + 1, end - 1);
        } else
        {
            return false;
        }
    }

    //Prime Check Function
    public static int prime(int num, int i)
    {
        if (i == 1)
        {
            return 1;
        } else if (num % i == 0)
        {
            return 0;
        } else
        {
            return prime(num, i - 1);
        }
    }

} //END CLASS

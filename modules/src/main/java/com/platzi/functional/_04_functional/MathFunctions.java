package com.platzi.functional._04_functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions {
    public static void main(String[] args) {
        System.out.println("Hola Platzi");
        Function<Integer, Integer> square = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };
        System.out.println(square.apply(5));
        System.out.println(square.apply(25));
        System.out.println(squareFunction(5));

        Function<Integer, Boolean> isOdd = x -> x % 2 == 1;

        // genera validaciones
        Predicate<Integer> isEvent = x -> x % 2 == 0;
        isEvent.test(4); // true
    }

    static  int squareFunction(int x){
        return x * x;
    }

    static  class  Student {
        private  double calificaion;

        public  Student(double calificaion){
            this.calificaion = calificaion;
        }

        public double getCalificaion() {
            return calificaion;
        }
    }
}

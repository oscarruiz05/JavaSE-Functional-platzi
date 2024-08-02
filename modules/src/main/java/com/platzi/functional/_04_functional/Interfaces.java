package com.platzi.functional._04_functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Interfaces {
    public static void main(String[] args) {
//        DoOperation operateFive = text -> System.out.println(text);
//        DoOperation operateFive = System.out::println;
//        operateFive.execute(5,"Oscar");
//        operateFive.take("Oscar");
        List<String> distroList = Arrays.asList("Ubuntu 22.04 LTS", "Kubuntu 21.10", "Manjaro Xfce Desktop");

        Stream<String> distroStream = distroList.stream(); // crea un Stream a partir de la lista
        Stream<String> ubuntuStream = distroStream.filter(distroName -> distroName.contains("ubuntu")); // Devuelve un nuevo Stream con los elementos que contengan el texto "ubuntu"
        Stream<String> lowercaseStream = ubuntuStream.map(String::toLowerCase); // Devuelve un nuevo Stream con los nombres en minúsculas
        Stream<String> lowDashStream = lowercaseStream.map(nombre -> nombre.replaceAll(" ", "-")); // Devuelve un nuevo Stream donde se han reemlazado los espacios por "_"
        lowDashStream.forEach(System.out::println); // Se recorre el Stream para mostrar sus elementos

// En lugar de asignar cada Stream a una variable, se pueden encadenar las llamadas a las funciones y obtener el mismo resultado
        distroList.stream()
                .filter(distroName -> distroName.contains("ubuntu"))
                .map(String::toLowerCase)
                .map(nombre -> nombre.replaceAll(" ", "-"))
                .forEach(System.out::println);
    }

    @FunctionalInterface
    interface  DoOperation {
        void take(String text);
        default  void  execute(int x, String text) {
            while (x-- > 0){
                take(text);
            }
        }
    }
}

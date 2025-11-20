package by.vadarod.practice_task7_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> entry = new HashMap<>();

        //entry.put(0, "string1");
        entry.put(2, "string2");
        entry.put(3, "string3");
        entry.put(4, "string4");
        entry.put(5, "string5");
        entry.put(6, "string4");
        entry.put(7, "string5");

        Set <Integer> keys = entry.keySet();
        Integer var = 1;
        for(Integer i : keys){
            if(i > 5){
                System.out.println(entry.get(i));
            }
            if (i == 0){
                System.out.println(entry.values());
            }
            String val = entry.get(i);
            if(val.length() > 5){

                var = i * var;
            }
        }
        System.out.println(var);


    }
}
/*
1. Заполнить HashMap 10 объектами <Integer, String>.
Найти строки у которых ключ>5. Если ключ = 0, вывести строки через запятую. Перемножить все ключи, где длина строки>5.
 */
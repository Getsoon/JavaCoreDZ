package Lesson3.HW3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class HomeWork3 {
    public static void main(String[] args){
        String[] word = {"Mark", "Chair", "Derrek", "Mikhail",
                "Stenly", "Irina", "Mark", "Monika", "Derrek", "Ben", "Bob",
                "Mikhail", "Don", "Melony", "Mark", "Stenly"};

        HashSet<String> hs = new HashSet<>(Arrays.asList(word));
        System.out.println(hs);

        HashMap<String, Integer> hm = new HashMap<>();
        for (String o: word) {
            hm.put(o, hm.getOrDefault(o, 0) + 1);
        }

        System.out.println(hm);
        System.out.println(hm.keySet());
    }

    static class PhoneBook{
        HashMap<String, HashSet<String>> hm;

        public  PhoneBook(HashMap<String, HashSet<String>> hm){
            this.hm = new HashMap<>();
        }

        public void add(String name, String phone){
            if(!hm.containsKey(name)) hm.put(name, new HashSet<>());
            hm.get(name).add(phone);
        }

        public HashSet<String> get(String name){
            return hm.get(name);
        }
    }
}
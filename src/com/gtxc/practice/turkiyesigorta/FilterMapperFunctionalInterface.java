package com.gtxc.practice.turkiyesigorta;

/*
    Created by gt at 6:03 PM on Sunday, March 13, 2022.
    Project: practice, Package: com.gtxc.practice.turkiyesigorta.
*/

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

class Filter {

    public static Predicate<String> nameStartingWithPrefix(String prefix) {
        return s -> {
            if (s.length() < prefix.length()) {
                return false;
            }
            return prefix.equals(s.substring(0, prefix.length()));
        };
    }
}

class Mapper {

    public static Function<String, CharactersCount> getDistinctCharactersCount() {
        return s -> {
            int[] charIndex = new int[255];
            for (int i = 0; i < s.length(); ++i) {
                ++charIndex[s.charAt(i)];
            }
            int distinctCount = 0;
            for (int index : charIndex) {
                if (index > 0) {
                    ++distinctCount;
                }
            }
            return new CharactersCount(s, distinctCount);
        };
    }
}
class CharactersCount {
    private final String name;
    private final Integer distinctCharacterCount;

    public CharactersCount(String name, Integer distinctCharacterCount) {
        this.name = name;
        this.distinctCharacterCount = distinctCharacterCount;
    }

    @Override
    public String toString() {
        return "\"" + this.name + "\" has " + this.distinctCharacterCount + " distinct characters.";
    }
}

public class FilterMapperFunctionalInterface {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "aaryanna",
                "aayanna",
                "airianna",
                "alassandra",
                "allanna",
                "allannah",
                "allessandra",
                "allianna",
                "allyanna",
                "anastaisa",
                "anastashia",
                "anastasia",
                "annabella",
                "annabelle",
                "annebelle"
        );

        names.stream()
                .filter(Filter.nameStartingWithPrefix(scanner.nextLine()))
                .map(Mapper.getDistinctCharactersCount())
                .forEachOrdered(System.out::println);
    }
}
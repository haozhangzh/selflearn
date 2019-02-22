package org.java.language.specification.demo;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Arrays.asList("a","b","c").forEach(e -> System.out.println(e));
        List<String> array = (List) Arrays.asList("a","c","b","d");
        array.sort((e1,e2) -> e1.compareTo(e2));
        array.forEach(e -> System.out.println(e));
    }
}

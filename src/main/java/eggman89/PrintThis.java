package eggman89;

import com.google.common.collect.Sets;

import java.util.Set;

public class PrintThis {
    public static void main(String[] args) {
        System.out.println("print this");

        Set<String> aNewSet = Sets.newHashSet();
        aNewSet.add("2");

        System.out.println(aNewSet);
    }
}

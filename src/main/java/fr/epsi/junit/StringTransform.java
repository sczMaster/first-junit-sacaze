package fr.epsi.junit;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class StringTransform {
    public static String concat(String... c){
        return Arrays.stream(c)
                .filter(Objects::nonNull)
                .collect(Collectors.joining());
    }
}







package fr.epsi.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringTransformTest {
    @Test
    public void should_concat_two_strings_when_strings_are_provided(){
        Assertions.assertEquals("UneChaine",
                StringTransform.concat("Une", "Chaine"));
    }

    @Test
    public void when_one_string_is_null_expect_the_other_string(){
        Assertions.assertEquals("Chaine",
                StringTransform.concat(null, "Chaine"));
    }
}



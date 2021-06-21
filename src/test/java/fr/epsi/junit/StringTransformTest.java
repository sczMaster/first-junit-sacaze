package fr.epsi.junit;

import org.junit.jupiter.api.*;

public class StringTransformTest {

    private StringTransform stringTransform;

    @BeforeAll
    public static void initGlobal(){
        System.out.println("======================");
        System.out.println("Init globale");
    }

    @BeforeEach
    public void initEach(){
        System.out.println("----------------------");
        System.out.println("Init apres chaque test");

       stringTransform = new StringTransform();
    }

    @Test
    public void should_concat_two_strings_when_strings_are_provided(){
        var ret = this.stringTransform.concat("Une", "Chaine");

        Assertions.assertEquals("UneChaine", ret);
    }

    @Test
    public void when_one_string_is_null_expect_the_other_string(){
        var ret =  this.stringTransform.concat(null, "Chaine");

        Assertions.assertEquals("Chaine", ret);
    }


    @AfterEach
    public void cleanEach(){
        System.out.println("Nettoyage apres chaque test");
        System.out.println("----------------------");
    }

    @AfterAll
    public static void cleanGlobal(){
        System.out.println("Nettoyage globale");
        System.out.println("======================");
    }


}



package com.example;

import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {

    @Test
    public void eatMeatTestDouble() throws Exception{
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);

    }
    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals(expected, actual);
    }

}
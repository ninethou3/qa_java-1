package com.example;

import org.junit.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
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

        @ParameterizedTest
        @ValueSource(ints = {1, 2, 3, 0})
        public void getKittensInt(int expected) {
            Feline feline = new Feline();
            feline.getKittens();
            assertEquals(expected, feline.getKittens(expected));
        }



}
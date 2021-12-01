package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(lion.getKittens()).thenReturn(1);
        int actual = lion.getKittens();
        assertEquals(1, actual);
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean actual = lion.doesHaveMane();
        assertTrue(actual);
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(lion.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = lion.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);


    }

    @Test(expected = java.lang.Exception.class)
    public void lionSexHaveException() throws Exception {
        Lion lion = new Lion("Нечто", feline);
        lion.doesHaveMane();
    }

}
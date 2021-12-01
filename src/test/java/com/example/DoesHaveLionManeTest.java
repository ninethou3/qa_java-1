package com.example;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class DoesHaveLionManeTest {

    Feline feline;
    String sex;
    boolean expected;

    public DoesHaveLionManeTest(String sex, boolean expected){
            this.sex = sex;
            this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getLionData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean actual = lion.hasMane;
        assertEquals(expected, actual);
    }



}

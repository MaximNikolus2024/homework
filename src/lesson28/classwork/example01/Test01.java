package lesson28.classwork.example01;

import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class Test01 {
    @Test
    public void test(){
        assertTrue(2 > 1);
    }
    @Test
    public void testNull(){
        Random random = null;
        assertNull(random);
    }
    @Test
    public void testEquals(){
        String s1 = "1111";
        String s2 = "2222";
      String res = s1 + s2;
        int expected = 8;
       int actual =  res.length();
       assertEquals(expected, actual);
    }
    @Test
    public void TestStrings(){
        String s = "";
        assumeTrue(s.length() != 0);
        s += "Hello";
        assumeTrue(s.length() > 0);
    }
}

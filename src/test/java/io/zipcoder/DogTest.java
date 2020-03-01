package io.zipcoder;

import org.junit.Test;
import org.junit.Assert;

public class DogTest
{
    @Test
    public void DogTest()
    {
        Dog name = new Dog("clifford");
        String actual = name.getName();
        String expected = "clifford";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void SpeechTest()
    {
        String actual = new Dog("cliffors").speak();
        String expected = "bark";
        Assert.assertEquals(expected, actual);
    }
}
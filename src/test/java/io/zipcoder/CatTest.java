package io.zipcoder;

import org.junit.Test;
import org.junit.Assert;

public class CatTest
{
    @Test
    public void CatTest()
    {
        Cat name = new Cat("fluffy");
        String actual = name.getName();
        String expected = "fluffy";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void SpeechTest()
    {
        String actual = new Cat("fluffy").speak();
        String expected = "meow";
        Assert.assertEquals(expected, actual);
    }
}
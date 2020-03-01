package io.zipcoder;

import org.junit.Test;
import org.junit.Assert;

public class FishTest
{
    @Test
    public void FishTest()
    {
        Fish name = new Fish("nemo");
        String actual = name.getName();
        String expected = "nemo";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void SpeechTest()
    {
        String actual = new Fish("nemo").speak();
        String expected = "glub";
        Assert.assertEquals(expected, actual);
    }
}
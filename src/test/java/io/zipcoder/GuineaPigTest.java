package io.zipcoder;

import org.junit.Test;
import org.junit.Assert;

public class GuineaPigTest
{
    @Test
    public void GuineaPigTest()
    {
        GuineaPig name = new GuineaPig("whiskers");
        String actual = name.getName();
        String expected = "whiskers";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void SpeechTest()
    {
        String actual = new GuineaPig("whiskers").speak();
        String expected = "wheek";
        Assert.assertEquals(expected, actual);
    }
}

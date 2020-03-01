package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class SortingTest
{
    @Test
    public void SortingTest()
    {
        Cat catTest = new Cat("fluffy");
        Cat catTest2 = new Cat("snowball");
        Dog dogTest = new Dog("sasha");
        Dog dogTest2 = new Dog("gordon");
        Fish fishTest = new Fish("nemo");
        Fish fishTest2 = new Fish("dory");
        GuineaPig guineaPigTest = new GuineaPig("gandalf");
        GuineaPig guineaPigTest2 = new GuineaPig("pigasso");

        ArrayList<Pet> expected = new ArrayList<Pet>();

        expected.add(catTest);
        expected.add(catTest2);
        expected.add(dogTest);
        expected.add(dogTest2);
        expected.add(fishTest);
        expected.add(fishTest2);
        expected.add(guineaPigTest);
        expected.add(guineaPigTest2);

        ArrayList<Pet> allPets = new ArrayList<Pet>();

        allPets.add(catTest);
        allPets.add(catTest2);
        allPets.add(dogTest);
        allPets.add(dogTest2);
        allPets.add(fishTest);
        allPets.add(fishTest2);
        allPets.add(guineaPigTest);
        allPets.add(guineaPigTest2);

        Collections.sort(allPets);

        assertEquals(expected, allPets);
    }
}

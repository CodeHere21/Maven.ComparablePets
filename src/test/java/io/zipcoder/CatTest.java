package io.zipcoder;

import junit.framework.TestCase;
import org.junit.Assert;

public class CatTest extends TestCase {

    public void testCompareTo() {
        String givenName="Zula";
        Cat cat=new Cat(givenName);

        String actual= cat.getName();

        Assert.assertTrue(givenName.compareTo(cat.getName())==0);
    }
}
package com.etienne.testjenkins;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by etiennevalette on 18/12/2017.
 */
public class DummyClassTest {

    private DummyClass subject;

    @Before
    public void setUp() throws Exception {
        subject = new DummyClass();
    }

    @Test
    public void dummyMethodShouldReturnFour() throws Exception {
        assertEquals(4, subject.dummyMethod());
    }

}
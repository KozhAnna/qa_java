package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Assert;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    IFeline feline;

    @Test
    public void lionCreate() throws Exception {

        Lion lion = new Lion("Самец", feline);
        Mockito.when(lion.getKittens()).thenReturn(1);
        int kittensCount = lion.getKittens();
        Assert.assertEquals(1, kittensCount);
    }

}
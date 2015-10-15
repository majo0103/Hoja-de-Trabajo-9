/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Peter
 */
public class SimpleSetTest {
    
    /**
     * Test of get method, of class SimpleSet.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Word word = null;
        SimpleSet instance = new SimpleSet();
        Word expResult = null;
        Word result = instance.get(word);
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class SimpleSet.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Word wordObject = null;
        SimpleSet instance = new SimpleSet();
        instance.add(wordObject);
    }
    
}

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
public class SplayTreeTest {
    
    public SplayTreeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class SplayTree.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Word key = null;
        SplayTree instance = new SplayTree();
        instance.add(key);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class SplayTree.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Word key = null;
        SplayTree instance = new SplayTree();
        instance.remove(key);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findMin method, of class SplayTree.
     */
    @Test
    public void testFindMin() {
        System.out.println("findMin");
        SplayTree instance = new SplayTree();
        Word expResult = null;
        Word result = instance.findMin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findMax method, of class SplayTree.
     */
    @Test
    public void testFindMax() {
        System.out.println("findMax");
        SplayTree instance = new SplayTree();
        Word expResult = null;
        Word result = instance.findMax();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class SplayTree.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Word key = null;
        SplayTree instance = new SplayTree();
        Word expResult = null;
        Word result = instance.get(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class SplayTree.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        SplayTree instance = new SplayTree();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

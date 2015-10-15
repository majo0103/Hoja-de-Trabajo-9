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
public class RedBlackBSTTest {

    /**
     * Test of get method, of class RedBlackBST.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Word key = null;
        RedBlackBST instance = new RedBlackBST();
        Object expResult = null;
        Object result = instance.get(key);
        assertEquals(expResult, result);
    }
    /**
     * Test of put method, of class RedBlackBST.
     */
    @Test
    public void testPut() {
        System.out.println("put");
        Word key = null;
        Object val = null;
        RedBlackBST instance = new RedBlackBST();
        instance.put(key, val);
    }

 
}

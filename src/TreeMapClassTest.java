/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;

/**
 *
 * @author Peter
 */
public class TreeMapClassTest {

    /**
     * Test of get method, of class TreeMapClass.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Word word = null;
        TreeMapClass instance = new TreeMapClass();
        Word expResult = null;
        Word result = instance.get(word);
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class TreeMapClass.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Word wordObject = null;
        TreeMapClass instance = new TreeMapClass();
        instance.add(wordObject);
    }

    private void assertEquals(Word expResult, Word result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

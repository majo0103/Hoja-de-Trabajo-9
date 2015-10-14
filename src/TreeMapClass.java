/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MariaJose
 */

import java.util.Map;
import java.util.TreeMap;
public class TreeMapClass implements WordSet {
    
    private TreeMap<String,Word> base;
    
    public TreeMapClass()
	{
		base = new TreeMap<String,Word>();
	}
    
    public Word get(Word word)
	{   
               
		return base.get(word.getWord());
	}
	
	public void add(Word wordObject)
	{
            base.put(wordObject.getWord(),wordObject);
                        
	}
}

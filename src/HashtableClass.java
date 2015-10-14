/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MariaJose
 */
import java.util.*;

public class HashtableClass  implements WordSet
{
	private final HashMap<String,Word> base;
	
	public HashtableClass()
	{
		base = new HashMap<>();
	}
	
    /**
     *
     * @param word
     * @return
     */
    @Override
	public Word get(Word word)
	{

		return base.get(word.getWord());
	}
	
        @Override
	public void add(Word wordObject)
	{
		base.put(wordObject.getWord(),wordObject);
               
	}
}


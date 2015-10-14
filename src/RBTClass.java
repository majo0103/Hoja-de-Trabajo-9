


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MariaJose
 */
public class RBTClass implements WordSet  {
        
	private final RedBlackBST<String,Word> base;
	
    /**
     *
     */
    public RBTClass()
	{
		base = new RedBlackBST<String,Word>();
	}
	
        @Override
	public Word get(Word word)
	{
		return base.get(word.getWord());
	}
	
    /**
     *
     * @param wordObject
     */
    @Override
	public void add(Word wordObject)
	{
           base.put(wordObject.getWord(),wordObject);
           
	}
}

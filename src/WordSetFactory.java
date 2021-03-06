/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MariaJose
 */

public class WordSetFactory {
	
	// Metodo que genera un objeto que implementa WordSet
	// parametro tipo: 1 = SimpleSet
	//                         2 = implementado con Red black tree
	//                         3 = implementado con Splay Tree
	//                         4 = implementado con Hash Table
	//                         5 = implementado con TreeMap (de Java Collection Framework)
	
	public static WordSet generateSet(int tipo)
	{
        
        if (tipo == 1)
            return new SimpleSet();
        
        else if (tipo == 2)
            return new RBTClass();
        
        else if(tipo ==3)
            return new SplayTree();
        
        else if (tipo==4) 
            return new HashtableClass();
        
        else if (tipo==5) 
            return new TreeMapClass();
        
        else 
            return new SimpleSet();
            
            
        
        }
        
    }
        
	   //if (tipo == 1)
		    //return new SimpleSet();
		//else
       // if (tipo ==2)
         //   return new RBTree();
       // if (tipo ==3)
        //    return new TreeS();
		    // aqui se regresara el set empleando sus implementaciones:
			// if tipo == 2 cree una instancia para un Wordset implementao con Red Black Tree
			// if tipo == 3 cree una instancia para un Wordset implementado con Splay Tree
			// if tipo == 4 cree una instancia para un Wordset implementado con Hash table
			// if tipo == 5 cree una instancia para un Wordset implementado con TreeMap
			
			//return new RedBlackBST(); // modificarlo para que regrese la implementacion seleccionada
	
	
    

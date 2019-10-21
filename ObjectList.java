//Used to store fraction counters
public class ObjectList
{
	private Object[] anything = new Object[100];
    private int numElements = 0; 
   
	/*
	 * This class is used as a array that we can acess with other classes. It should work as a tempate and should 
	 * not mention fraction at all
	 *
	 *Andrew Choi
	 *January 23 2019
	 */
	
	
	/*
	 * In the add method we check if there is an empty index and add  the fraction counter if there is
	 */
	public void add (Object nx)
	{
		//FractionCounter addThis = (FractionCounter)nx;
	         for(int i = 0; i < anything.length; i++)
	         {
		  if(anything[i] == null)
		  {
			  anything[numElements] = nx;
				numElements++;
				break;
		  }
	         }
              

	}

	/*
	 * Here I have a toString method that returns the values of the array
	 */
	public String toString()
	{
		String retVal = "";
		for(int i = 0; i <anything.length; i++)
         if(anything[i] != null)
         {
		{
			retVal += (anything[i] + "," + " "  + "\n");
		}
         }
		
      return retVal;
	}
	
	
	/*
	 * getIndex is used to take in an object and return the index that  contains the object
	 */
	public int getIndex(Object one)
	{
		int index = 0;
		for( int i = 0; i < anything.length; i++)
		   {
			if(anything[i] ==one  )
				index =i;
		
           }
		return index;	
	}
/*
 * check is to check if the objects are the same	 
 */
	public boolean check (Object one)
	{
		boolean checker = false;
		for( int i = 0; i < anything.length; i++)
		   {
			if(anything[i] ==one  )
				checker = true;
		
           }
		return checker;	
	}
	
	/*
	 * This method returns the object with a given index
	 */
	public Object getObject(int index)
	{
		return anything[index];
	}
	
	
	//setIndex sets the index of the array to the given object
	public void setIndex(int  index, Object one)
	{
		anything[index] = one;
	}
	
	
	//getSize returns the size of the array
	public int getSize()
	{
		int size = 0; 
		for(int i =0; i<anything.length; i++) {
		
			if(anything[i]!= null)
				size++; 
		}	
		return size;
		
	}
	
	
	
}

package listas;

public class nodo 
{
	String text;
	int id;
	
	nodo next = null; //Pointer
	
	/**
	* Zero-parameters constructor
	*/
	
	public nodo() {}
	
	/**
	* Constructor of the node
	* @param grade
	* @param value
	*/
	
	public nodo(String text, int id)
	{
		this.text = text;
		this.id = id;
	}
	
	/**
	* This method is used 
        * @return 
	*/
	
	public String atoString()
	{
		return "Text:" + this.text + "\t" + "ID:" + this.id + "\n";
	}
}

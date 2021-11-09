package com.demo;

public class WrapperClass {
	
	
	public static void main(String[] args) {
	Integer	number =	new Integer(55);//int
	Integer	number2 =	new Integer("55");//String
	Float	number3 =	new Float(55.0);//double	argument
	Float	number4 =	new Float(55.0f);//float	argument
	Float	number5 =	new Float("55.0f");//String
	Float	number6 =	55.0f;//String
	Character	c1 =	new Character('C');//Only	char	constructor
	//Character	c2	=	new	Character(124);//COMPILER	ERROR
	Boolean	b =	new Boolean(true);
	//"true"	"True"	"tRUe"	- all	String	Values	give	True
	//Anything	else	gives	false
	Boolean	b1 =	new Boolean("true");//value	stored	- true
	Boolean	b2 =	new Boolean("True");//value	stored	- true
	Boolean	b3 =	new Boolean("False");//value	stored	- false
	Boolean	b4 =	new Boolean("SomeString");//value	stored	- fals

	    {
	        String str = "Geeks\nFor\nGeeks";
	        System.out.println(str
	                               .lines()
	                               .collect(
	                                   Collectors.toList()));
	    }
	
}
}
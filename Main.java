/* 
Zachery Allen
CIS221 
T & Th 2:10pm 
*/

//Create Main Class with constructors
public class Main{
	int x;
	String y;
	//apply values to the x&y
	public Main(){
		x= 7;
		y= "The number is 5";
	}

	public static void main(String[] args){
		//Create object of Main()
		Main myObj = new Main();
		//If the myObj.x is 5 print the statement on myObj.y, otherwise changes the y string and print
		if(myObj.x == 5){
			System.out.println(myObj.y);
		} else {
			myObj.y = "The number is not 5.";
			System.out.println(myObj.y);
		}
	}
}
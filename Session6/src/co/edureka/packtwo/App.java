package co.edureka.packtwo;

import co.edureka.packone.One; // import the class in another package is you wish to use it
//import co.edureka.packone.Two; // error : Only public classes are accessible outside the package and default classes work only within the package

// Which class can be imported -> only public
//import co.edureka.packone.*; // Import all public classes in packone

// Inheritance across packages
// 1. Only public and protected is accessible by Child
// 2. Outside the package child cannot access private and default :)
class Three extends One{
	
	void show(){
		pubShow(); // pubShow of One i.e. in Parent Class can be accessed by Child Class
		protShow(); // protShow of One i.e. in Parent Class can be accessed by Child Class
		
		//pvtShow(); // err
		//defShow(); // err
	}
	
}

public class App {

	public static void main(String[] args) {
		
		//One oRef = new One();
		//oRef.pvtShow(); err
		//oRef.defShow(); err
		//oRef.protShow();err
		//oRef.pubShow();
		
	
		Three tRef = new Three();
		tRef.show();
	}

}

// 2. default : Accessible within the package only
// 3. public  : Accessible Everywhere
// 4. protected: Accessible within the package only just like default

// default and protected are quite same i.e. accessible within the package but not outside
// How default and protected are different ?
// default is not inherited i.e. child cannot access it. protected is inherited and child can access it from within the class !!

// Access Levels : (Most Accessible) public > protected > default > private (Least Accessible)

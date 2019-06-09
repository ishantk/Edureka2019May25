package co.edureka.packone;

public class App {

	public static void main(String[] args) {
		
		// We can create Object of both One(public) and Two(default) in App
		One oRef = new One();
		Two tRef = new Two();

		//oRef.pvtShow(); // private is not accessible
		oRef.defShow();
		oRef.protShow();
		oRef.pubShow();
		
		System.out.println();
		
		//tRef.pvtShow(); // private is not accessible
		tRef.defShow();
		tRef.protShow();
		tRef.pubShow();
	}
	

}

// PS: Other than private within the same package everyone is accessible :)
//     1. private : accessible only in the class and not outside

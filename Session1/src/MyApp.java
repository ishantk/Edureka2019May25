
public class MyApp { // MyApp class scope starts here

	// main is a method
	// whatever we write in main is executed in a sequence i.e. line by line
	public static void main(String[] args) { // main scope starts here
		
		// Instruction to print something on Console as textual data:
		System.out.println("Hello from Edureka !!");
		
		System.out.println("This is Awesome");

	} // main scope ends here

} // MyApp class scope ends here

// We can create multiple classes in the same source file :)
class One{
	
}

// PS: Bytecodes i.e. .class files are generated based on number of classes in your source file
// .java is source file, which can have n-number of classes !! For every class we will have a .class file
// compilation happens automatically in eclipse. javac is a compiler which is installed along with JDK

/*
Java : PL as well a technology
	JSE : Java Standard Edition
		  Desktop Application
	JEE : Java Enterprise Edition
		  Web Application
	JME : Java Mobile Edition
		  Mobile Applications | Featured Phones	  		  


Programming Language
	PL is used to create a Software		  
	Software shall solve a problem
	Software : Model | View   | Controller -> Software Architecture/Design Pattern
		       Data  | UI     | Logic
		       12, 2 | Buttons| *
		       Object : is a data storage container

		       ?
		       12 * 2 = 24
		       eg: Amazon : If they need to do accounting for how many products sold across the world today ?
		       This shall include lot of complex arithmetic operations !!
		       As a human we can solve it BUT on the cost of TIME !!
		       Computation will take time if humans will work
		       But For Computer with a Software this will save lot of TIME !!


PL has its features !!		       
Software : 	
		1. System Software		 | Operating System eg: W, L, M, U etc
		2. Application Software  | Working on Softwares which runs on OS

		Based on features of PL's we choose them to create either System SW or App SW


JDK : Java Development Kit
	  JDK has to be installed on our computers so that we can use java Programming Language Built in codes to create our program

	  Think of JDK as a toolkit to Carpenter	

Framework : is set of API's
API : Application Programming Interfaces : Built in Codes to be used by us
		eg: 
		C/C++ -> System Software

		C++, Java, Python etc -> Application Software
		Java outshines all the PL's when it comes to create an Application SW


		Orange Juice in Making :)

		Oranges 			Source

		Juicer

		Liquid Juice 		Result

		Pack It

		Glass \_/			End Result

		> As a customer/consumer i will drink juice from glass
C1 :    Give me juice in Disposable Glass
C2 : 	Pack me juice in a bottle

Different customers may have different requirements how they will consume Juice


	To create a Software we need to create a program using Programming Language
	With PL we will write some commands and save those commands in a file

	Program is saved in a file with extension of that PL
	Program contains commands or programming instructions

	MyApp.cpp 			Source Code 		high level language

	Compiler

	MyApp.obj 			Object Code 		low level language

	Pack It

	MyApp.exe 			Executable Code

W	MyApp.exe is installed in Windows and shall work like a software
M   MyApp.dmg
L   MyApp.sh


	MyApp.java 			Source Code 		high level language

	Compiler

	MyApp.class 		ByteCode or Java's Magic 

	No Packing

	.class file can be executed on any OS beacuse of JVM :)
	Java is Platform Independent : Java can run on any OS because of JVM.

	JVM is a System Software which is pre-installed by OS Manufaturer on OS
	So as a customer whenwe use OS, JVM is already installed in it :)



	JDK: Java Development Kit -> which we need to install
		Contains API's : API is built in code which we can use in our program 
		Compiler : to convert source code to bytecode

	JRE : Java Runtime Environment -> is installed automatically alongwith JDK
		JRE helps to load bytecode into JVM

	JVM : Java Virtual Machine i.e. a System SW
		 Pre-Installed in our OS by OS vendor :)
		 JVM is developed by Oracle	



		 STEP1:
		 JDK: https://www.oracle.com/technetwork/java/javase/downloads/index.html
		 > Download JDK and Install It | Next Next .... Finish
		 > Setup Java Path : Foolow Manuals in your LMS or just google it up !!	
		 > Check version of java / javac on command prompts / Terminals

		STEP2:
		 Eclipse/IntelliJ
		 > IDE i.e. Integrated Development Environment
		 > A software which we developer will use to create softwares

		 PS: Install JDK Before Eclipse :)




Application Software:
	> Runs on OS
	> Can be created by using a PL eg: Java
	> Follows Model View Controller Architecture / Design Pattern
	> It is meant to solve Problem


	Problem Statement : A train running at the speed of 60 km/hr crosses a pole in 9 seconds. What is the length of the train?

	R #1. Identify Data in your Problem Statement !!
	
	Data:
	speed = 60
	time = 9

	R #2. Identify logic which will solve your Problem Statement !!
	Logic:
	1. convert speed int mtrs /secs
	2. distance = speed * time

	R #3. Develop UI to get data and show result to User !!
	Logic:
	View:
	User Interface where we can ask for inputs of the data from User
	We can also show the results i.e. output to the User

	Console : View | Textual UI



	Data:
	speed = 60
	time = 9

	How can we represent data in Programs !!
	We use Containers !!
	Container will store data !! is like a BOX !!

	1. Single Value Container
		can hold only one value

	2. Multi Value Container
		can hold many values
		2.1. Homogeneous Container : Same type of data
		2.2. Hetrogeneous Container: Different type of data


	Uber App : To book a cab

	Data : source location
		   destintion location
		   type of cab

	View : UI
	
	Logic : Find Shortest Distance and Shortest Path	   	



	Single Value Containers !!
	> Meant to store only 1 Value
	> Are also known as Primitives


	PL's : Data Types i.e. how we can create containers by specifying what should be data in it !!

*/
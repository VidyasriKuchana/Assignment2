# java Assignment2 
This is a program to print the given String i.e., name inside a rectangular format.

For example, if the user gives abcd as the string, the output will be like :

            +-------------------------------------------+
            |                                           |
            |                                           |
            |                                           |
            |                                     abcd  |
            |                                           |
            +-------------------------------------------+

We can make the number of rows and columns also dynamic by using scanner class and reading them from the console. But here in code, I gave the number of rows and columns manually.
We'll have to take the help of Scanner class from the package java.util and write a code to read the name from the console. Declare two variable to initialize number of rows an columns of the box. This is done by the following code.

            Scanner scan=new Scanner(System.in);
	System.out.println("Enter name to be displayed");
	String name=scan.next();
	            int rows=8;
	            int col=35;
                        
 Using nested for and applying if-else-if condition statements, we can print the box as given format i.e., printing "+" at all the four corners of the box, "-" on the top and bottom of the box, "|" on the either sides of the box, to print the user given name inside the box that is in the last second row levaing two columns from the last. 
 
 This is achieved by the following code in the program.

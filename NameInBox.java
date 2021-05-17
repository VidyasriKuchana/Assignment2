import java.util.Scanner;
public class NameInBox {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter name to be displayed");
	String name=scan.next();
	
	int rows=8;
	int col=35;
	for(int i=0;i<rows;i++) {
		for(int j=0;j<col;j++) {
			if((i==0&&j==0)||(i==0&&j==col-1)||(i==rows-1&&j==0)||(i==rows-1&&j==col-1))
				 System.out.print("+");
			else if(i==0||i==rows-1)
				 System.out.print("-");
			else if(j==0||j==col-1)
				 System.out.print("|");
			else if(i==rows-3&&j==col-(name.length()+2)) {
				for(int k=0;k<name.length();k++) System.out.print(name.charAt(k));
				j=j+name.length()-1;
			}
			else System.out.print(" ");
			
		}
		System.out.println();
	}
	}

}

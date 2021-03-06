package shapes;
import java.util.*;
public class Main 
{ 
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Shape>arr=new ArrayList<Shape>();
		while(true)
		{
		    System.out.println("ENTER THE Shape YOU WANT TO FEED");
	        System.out.println("PRESS 1 FOR Circle");
	        System.out.println("PRESS 2 FOR Square");
	        System.out.println("PRESS 3 FOR Rectangle");
	        System.out.println("PRESS 4 FOR SEARCHING Shape");
	        System.out.println("ENTER 5 FOR EXIT");
	        int x=sc.nextInt();
	        sc.nextLine();
	        switch(x)
	        {
	        case 1:
	            System.out.println("ENTER NAME OF Circle");
	            String n1=sc.nextLine();
	            System.out.println("ENTER RADIUS OF Circle");
	            int r=sc.nextInt();
	            sc.nextLine();
	            Circle obj=new Circle(r,n1);
	            arr.add(obj);
	            continue;
	        case 2:
	            System.out.println("ENTER NAME OF Square");
	            String n2=sc.nextLine();
	            System.out.println("ENTER SIDE MAGNITUDE");
	            int s1=sc.nextInt();
	            sc.nextLine();
	            Square obj1=new Square(n2,s1);
	            arr.add(obj1);
	            continue;
	        case 3:
	            System.out.println("ENTER NAME OF Rectangle");
	            String n3=sc.nextLine();
	            System.out.println("ENTER THE LENGTH OF Rectangle");
	            int l=sc.nextInt();
	            sc.nextLine();
	            System.out.println("ENTER THE BREADTH OF Rectangle");
	            int b=sc.nextInt();
	            sc.nextLine();
	            Rectangle obj2=new Rectangle(l,b,n3);
	            arr.add(obj2);
	            continue;
	        case 4:
	            System.out.println("ENTER NAME OF Shape YOU ARE SEARCHING");
	            String h=sc.nextLine();
	            int count=0;
	            for(Shape d:arr)
	            {
	                if(d.name.equals(h))
	                {
	                    count++;
	                    d.area();
	                }
	            }
	            if(count==0)
	            {
	                System.out.println("SHAPE NOT FOUND");
	            }
	            continue;
	        case 5:
	            System.exit(0);
	       
	        }
		}
	}

}

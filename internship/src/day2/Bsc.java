package day2;

public class Bsc extends Department
{

   
    String lname;
  
    int age;
    int sales;
    Bsc(String fn,String lname,String department,int age,int sales)
    {
        fname=fn;
        this.lname=lname;
        dep=department;
        this.age=age;
        this.sales=sales;
    }
    public void salary()
    {
        System.out.println("FIRST NAME OF EMPLOYEE "+fname);
        System.out.println("LAST NAME OF EMPLOYEE "+lname);
        System.out.println("AGE OF EMPLOYEE "+age);
        System.out.println("DEPARTMENT TYPE OF EMPLOYEE :"+dep);
        int sals=(int)(sales*(12/100.0f));
        int inc=(int)(base*(10/100.0f));
        sals=base+inc+sals;
        System.out.println("COMPANY DECIDED TO GIVE INCREMENT OF 10% OF YOUR CURRENT BASE SALARY");
    
        System.out.println("NEW SALARY IS "+sals);
    }
    
}
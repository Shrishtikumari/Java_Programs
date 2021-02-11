/*
    Name:Shrishti Kumari
      
      Description:To demonstrate a program to create a EMPLOYEE class contains following data members: 
                  Employee_Number, Employee_Name, Basic, DA, IT, Net_Sal. Member Functions: to calculate 
                  Net_Sal and to print data members compute Net_Sal of the employee (DA= 52% of Basic and 
                  Income Tax(IT)=30% of the gross salary). Net sal=Besic+DA-IT.
                  While writing consider following:
                 i>Initialize members using method.
                 ii>Create more than two objects.
      Algorithm:
           
           Algorithm description: This algorithm is all about how we implement a java program to create EMPLOYEE class contains 
                                  following data members: Employee_Number, Employee_Name, Basic, DA, IT, Net_Sal. Member Functions: to calculate 
                                  Net_Sal and to print data members compute Net_Sal of the employee.
                                  
           Input Variables:Employee_name, Employee_number,Basic,DA,IT
           Output Variables: Net_sal
    1.Start
	2.Create a class of name  EMPLOYEE which consists of data members and member functions.
    3.In main function in Qp2_L3 class
    4.Display "============IMPLEMENTING EMPLOYEE RECORD============="
    5.Display "=======>EMPLOYEE 1 RECORD:"
    6.Create an object of class EMPLOYEE 
    7.EMPLOYEE E1=new EMPLOYEE("Shrishti Kumari",201900131,42.2f) and initializing it during compile time which  will automatically call 
      Parameterized constructor.
      7.1 this.Employee_name<-Employee_name
      7.2 this.Employee_number<-Employee_number
      7.3 this.Basic<-Basic
    8.Calling member function Calculation to perform all the operations.
    9.E1.Calculation()
      9.1 DA <-Basic*52/100
      9.2 IT<- ((Basic+DA)*30/100)
      9.3 Net_Sal<-((Basic + DA)-IT)
   10.Calling member function to display all the data.
   11.E1.display()
      11.1 Display ">Name: " and Employee_name value
      11.2 Display ">Employee no: " and Employee_number value
      11.3 Display ">Basic: " and Basic value
      11.4 Displaya ">DA: " and DA value
      11.5 Display ">IT: " and IT value
      11.6 Display ">Net Salary: " and Net_Sal value
   12.Display "=======>EMPLOYEE 2 RECORD:"
   13.EMPLOYEE E2=new EMPLOYEE("Tanya Singh",201800141,3.7f) and initializing it during compile time which  will automatically call 
      Parameterized constructor.
   14.Calling member function Calculation to perform all the operations.
   15.E2.Calculation()
   17.Calling member function to display all the data.
   18.E2.display()
   19.Display "=======>EMPLOYEE 3 RECORD:"
   20.EMPLOYEE E3=new EMPLOYEE("Aakanksha Roy",201900325,70) and initializing it during compile time which  will automatically call 
      Parameterized constructor.
   21.Calling member function Calculation to perform all the operations.
   22.E3.Calculation()
   23.Calling member function to display all the data.
   24.E3.display()
   25.Stop

INPUTS / OUTPUTS

============IMPLEMENTING EMPLOYEE RECORD=============

=======>EMPLOYEE 1 RECORD:

>Name: Shrishti Kumari
>Employee no: 201900131
>Basic: 42.2
>DA: 21.944002
>IT: 19.243202
>Net Salary: 44.900803

=======>EMPLOYEE 2 RECORD:

>Name: Tanya Singh
>Employee no: 201800141
>Basic: 3.7
>DA: 1.9240001
>IT: 1.6872001
>Net Salary: 3.9368

=======>EMPLOYEE 3 RECORD:

>Name: Aakanksha Roy
>Employee no: 201900325
>Basic: 70.0
>DA: 36.4
>IT: 31.92
>Net Salary: 74.48

*/

//Create a class of name  EMPLOYEE which consists of data members and member functions.
class EMPLOYEE
{	 	  	 	  	 	   	        	 	
    //Data members
    int Employee_number;
    String Employee_name;
    float Basic;
    float DA;
    float IT;
    float Net_Sal;
    
    //Parameterized constructor
    EMPLOYEE(String Employee_name,int Employee_number ,float Basic)
    {
        //Using this keyword
        this.Employee_name=Employee_name;
        this.Employee_number=Employee_number;
        this.Basic=Basic;
    }
    
    //Member function for calculation
    void Calculation()
    {
        //Computing
        DA = Basic*52/100;
        IT= ((Basic+DA)*30/100);
        Net_Sal =((Basic + DA)-IT);
    }
    
    //Member function for displaying
    void display()
    {
        System.out.println(">Name: "+Employee_name);
        System.out.println(">Employee no: "+Employee_number);
        System.out.println(">Basic: "+Basic);
        System.out.println(">DA: "+DA);//Displaying
        System.out.println(">IT: "+IT);
        System.out.println(">Net Salary: "+Net_Sal);//Displaying
    }	 	  	 	  	 	   	        	 	
}

//Main function class which is same as project file name.
class Qp2_L3
{
    public static void main(String args[])
    {
        System.out.println("\n============IMPLEMENTING EMPLOYEE RECORD=============\n");
        System.out.println("=======>EMPLOYEE 1 RECORD:\n");
        EMPLOYEE E1=new EMPLOYEE("Shrishti Kumari",201900131,42.2f);// Creating object and initializing it during compile time which  will automatically call Parameterized constructor.
        E1.Calculation();//Calling function for the calculation
        E1.display();//Calling function to display all the data
        
            System.out.println("\n=======>EMPLOYEE 2 RECORD:\n");
            EMPLOYEE E2=new EMPLOYEE("Tanya Singh",201800141,3.7f);// Creating object and initializing it during compile time which  will automatically call Parameterized constructor.
            E2.Calculation();//Calling function for the calculation
            E2.display();//Calling function to display all the data
            
        System.out.println("\n=======>EMPLOYEE 3 RECORD:\n");
        EMPLOYEE E3=new EMPLOYEE("Aakanksha Roy",201900325,70);// Creating object and initializing it during compile time which  will automatically call Parameterized constructor.
        E3.Calculation();//Calling function for the calculation
        E3.display();//Calling function to display all the data
    }
}
	 	  	 	  	 	   	        	 	

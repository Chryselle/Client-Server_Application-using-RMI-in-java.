//Step 4b
import java.rmi.Naming; 
public class AddClient
  { 
public static void main(String args[]) 
{ 
try 
{ 
AddInterface ai=(AddInterface)Naming.lookup("//localhost/Add"); 
System.out.println("The sum of 2 numbers is: "+ai.sum(10,2)); 
} 
catch(Exception e) 
{ 
System.out.println("Client Exception: "+e); 
} 
} 
}


// The last step is to start the RMI registry, do not close it or else the code won't work
// in order to start rmi registry just type start rmiregistry in the command prompt

// Keep the server running by typing java AddServer

//open a new command prompt and run the client program to get the output

//so in total you will have 3 command prompt windows open. Do not close any of them till you don't get the output

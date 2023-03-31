// Remember in java it is very important that your class name and your file name match, otherwise the code won' t run

import java.rmi.*; 
public interface AddInterface extends Remote 
{ 
 public int sum(int n1,int n2) throws RemoteException; 
}


// After saving this file compile it using javac as follows
// type this in the command prompt/terminal javac AddInterface.java
// This will create a .class file for you

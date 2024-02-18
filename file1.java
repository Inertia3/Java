
import java.io.*;

class SeriDseri implements java.io.Serializable
{
	public int uid;
	public String name;

	// Default constructor
	public SeriDseri(int a, String b)
	{
		this.uid = a;
		this.name = b;
	}

}

class file1
{
	public static void main(String[] args)
	{ 
		SeriDseri object = new SeriDseri(13150, "Sahil Ansari");
		String filename = "file.ser";
		
		// Serialization 
		try
		{ 
			//Saving of object in a file
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			// Method for serialization of object
			out.writeObject(object);
			out.close();
			file.close();
			System.out.println("Object has been serialized");

		}
		
		catch(IOException ex)
		{
			System.out.println("IOException is caught");
		}


		SeriDseri object1 = null;

		// Deserialization
		try
		{ 
			// Reading the object from a file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			// Method for deserialization of object
			object1 = (SeriDseri)in.readObject();
			in.close();
			file.close();
			System.out.println("Object has been deserialized ");
			System.out.println("Name = " + object1.name);
			System.out.println("UID = " + object1.uid);
		}
		
		catch(IOException ex)
		{
			System.out.println("IOException is caught");
		}
		
		catch(ClassNotFoundException ex)
		{
			System.out.println("ClassNotFoundException is caught");
		}

	}
}

// transient protect our data for serializatiin
// default value of print is NULL
// default value of boolean is false
// default value of int is 0
// an interface that is empty doesnt contain any abstract methods or data members
// is called marker interface

//an intrface that contain only one abstract methods is called functional interface 
// and that methos is run()

//lifecycle of the thread 
// (born state)New -> start -> waiting state ->  running state (run()) -> terminate or dead state
// when a thread us dead it can't born again we have to create a new thread  

// we can implement threads in java by two ways 
// 1st using runnable interface 
// 2nd by extending the thread class
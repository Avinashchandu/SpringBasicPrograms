package assignment;
import java.io.*;


class SerializableClass implements Serializable {
 private static final long serialVersionUID = 1L;
 private int id;
 private String name;

 public SerializableClass(int id, String name) {
     this.id = id;
     this.name = name;
 }

 public int getId() {
     return id;
 }

 public String getName() {
     return name;
 }
}


class NonSerializableClass {
 private int value;

 public NonSerializableClass(int value) {
     this.value = value;
 }

 public int getValue() {
     return value;
 }
}


 

public class Main {
	public static void main(String[] args) {
	     
	     SerializableClass serializableObj = new SerializableClass(1, "SerializableObject");

	     try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serializable.dat"))) {
	         oos.writeObject(serializableObj);
	     } catch (IOException e) {
	         e.printStackTrace();
	     }

	     try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serializable.dat"))) {
	         SerializableClass deserializedObj = (SerializableClass) ois.readObject();
	         System.out.println("Deserialized Object - ID: " + deserializedObj.getId() + ", Name: " + deserializedObj.getName());
	     } catch (IOException | ClassNotFoundException e) {
	         e.printStackTrace();
	     }

	     
	     NonSerializableClass nonSerializableObj = new NonSerializableClass(42);

	    
	      try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("non_serializable.dat"))) {
	          oos.writeObject(nonSerializableObj);
	      } catch (IOException e) {
	          e.printStackTrace();
	      }
	 }
	}


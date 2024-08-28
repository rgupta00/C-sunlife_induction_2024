package com.dp.creational.a.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DemoSingleton {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException, IOException {
		
		Singleton singleton=Singleton.getSingleton();
		System.out.println(singleton.hashCode());
		
		
		Singleton singleton2=(Singleton) singleton.clone();
		System.out.println(singleton2.hashCode());
		
//		Singleton singleton=Singleton.getSingleton();
//		System.out.println(singleton.hashCode());
//		
//		//ser
//		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("foo.ser")));
//		oos.writeObject(singleton);
	
//		//de-ser
//		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("foo.ser")));
//		Singleton singleton2=(Singleton) ois.readObject();
//		System.out.println(singleton2.hashCode());
		
		//how to deal with reflection
		
//		Class<?> clazz=Class.forName("com.dp.creational.a.singleton.Singleton");
//		
//		Constructor[]constructors=clazz.getDeclaredConstructors();
//		constructors[0].setAccessible(true);
//		
//		Singleton singleton2=(Singleton) constructors[0].newInstance();
//		
//		System.out.println(singleton.hashCode());
//		System.out.println(singleton2.hashCode());
		
		
		//what about clonning
		//Singleton singleton2=(Singleton) singleton.clone();
		
		//
		
	}

}

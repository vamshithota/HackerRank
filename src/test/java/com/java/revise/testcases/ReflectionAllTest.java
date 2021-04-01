package com.java.revise.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.java.revise.Bird;
import com.java.revise.Goat;
import com.java.revise.Person;

public class ReflectionAllTest {

	private static List<String> getFieldNames(Field[] fields) {
		List<String> fieldNames = new ArrayList<>();
		for (Field field : fields)
			fieldNames.add(field.getName());
		return fieldNames;
	}
	
	private static List<String> getMethodNames(Method[] methods) {
	    List<String> methodNames = new ArrayList<>();
	    for (Method method : methods)
	      methodNames.add(method.getName());
	    return methodNames;
	}
	
	  @Test 
	  public void getAllMethodNames() { 
		  Object person = new Person();
	  
	  Field[] feilds = person.getClass().getDeclaredFields(); 
	  List<String> fieldNames =
	  getFieldNames(feilds);
	  
	  assertTrue(Arrays.asList("name","age").containsAll(fieldNames));
	  
	  }
	  @Test
	  public void getClassNameTC() {
		  Object goat = new Goat();
		  Class<?> cls = goat.getClass();
		  assertEquals("Goat",cls.getSimpleName());
		  //com.java.revise.Goat
		  assertEquals("com.java.revise.Goat", cls.getName());
		  assertEquals("com.java.revise.Goat", cls.getCanonicalName());
	  }
	  //to get accesmodifiers info
	  @Test
	  public void getAcessModeifiers() throws ClassNotFoundException {
		  Class<?> goat = Class.forName("com.java.revise.Goat");
		  Class<?> animalClass = Class.forName("com.java.revise.Animal"); 
		  int goatModifiers = goat.getModifiers();
		  int animalModifier = animalClass.getModifiers();
		  assertTrue(Modifier.isPublic(goatModifiers));
		  assertTrue(Modifier.isAbstract(animalModifier));
		  assertTrue(Modifier.isPublic(animalModifier));
	  }
	  //to get package info
	  @Test
	  public void getPackageInfoTC() {
		  Goat goat = new Goat("goat");
		  Class<?> goatClass = goat.getClass();
		  Package goatPackage = goatClass.getPackage();
		  assertEquals("com.java.revise", goatPackage.getName());
		  
	  }
	  //to get super class details
	  @Test
	  public void getSuperClassDetailsTc() {
		  Goat goat = new Goat("goat");
		  String str = "any string";
		  Class<?> goatClass = goat.getClass();
		  Class<?> goatSuperClass =  goatClass.getSuperclass();
		  assertEquals("Animal", goatSuperClass.getSimpleName()); 
		  assertEquals("Object", str.getClass().getSuperclass().getSimpleName());
	  }
	  
	  //to get implemented interface details
	  @Test
	  public void getImplementedInterfacesName() throws ClassNotFoundException {
		  Class<?> goatClass = Class.forName("com.java.revise.Goat");
		  Class<?> animalClass = Class.forName("com.java.revise.Animal");
		  Class<?>[] goatInterfaces = goatClass.getInterfaces();
		  Class<?>[] animalInterfaces = animalClass.getInterfaces();
		  assertEquals(1,goatInterfaces.length);
		  assertEquals(1,animalInterfaces.length);
		  
		  assertEquals("Locomotion", goatInterfaces[0].getSimpleName());
		  assertEquals("Eating", animalInterfaces[0].getSimpleName());
	  }
	  //to get constructors
	  @Test
	  public void getClassConstructorsTC() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		  Class<?> goatClass = Class.forName("com.java.revise.Goat");
		  Class<?> animalClass = Class.forName("com.java.revise.Animal");
		  Constructor<?>[] goatConstructors = goatClass.getConstructors();
		  Constructor<?>[] animalConstructors = animalClass.getConstructors();
		  assertEquals(2, goatConstructors.length);
		  assertEquals(2, animalConstructors.length);
		  
		  //inspect the constructors
		  Class<?> birdClass = Class.forName("com.java.revise.Bird");
		  Constructor[] constructors = birdClass.getConstructors();
		  assertEquals(3, constructors.length);
		  
		  //getting constructor by parameter class
		  Constructor<?> c1=  birdClass.getConstructor();
		  Constructor<?>  c2 =birdClass.getConstructor(String.class);
		  Constructor<?>  c3 = birdClass.getConstructor(String.class, boolean.class);
		  
		  // creating new instance out of Class 
		  Bird b  = (Bird)c1.newInstance();
		  Bird b2  = (Bird)c2.newInstance("Bird");
		  Bird b3  = (Bird)c3.newInstance("Bird",true);
		  assertEquals("Bird", b2.getName());
		  assertTrue(b3.isWalks());
		  
	  }
	  
	  // to inspect the feilds
	  @Test
	  public void getClassFields() throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		  Class<?> goatClass = Class.forName("com.java.revise.Animal");
		  Method[] methods = goatClass.getDeclaredMethods();
		  List<String> actualFields = getMethodNames(methods);
		  assertEquals(3,actualFields.size());
		  //get feild names from bird class and check its name
		  Class<?> birdClass = Class.forName("com.java.revise.Bird");
		  Field[] fields = birdClass.getFields();

		  assertEquals(1, fields.length);
		  assertEquals("CATEGORY", fields[0].getName());
		  
		  // getFields returns only public feilds if we want private feilds also we need to use getDeclaredMethods()
		  
		  Field[] allFields = birdClass.getDeclaredFields();
		  //System.out.println(allFields[0].getName());
		  assertEquals(1,allFields.length);
		  //to get feild type
		  Class walksFieldType = birdClass.getDeclaredField("walks").getType();
		  assertEquals("boolean", walksFieldType.getSimpleName());
	  }
}

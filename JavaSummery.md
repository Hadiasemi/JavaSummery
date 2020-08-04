---
# title: JavaSummery
# author: Hadi Asemi
# date:
# <!-- header-includes:
#   - \hypersetup{colorlinks=True,
#       allbordercolors={0 0 0},
#       pdfborderstyle={/S/U/W 1}
#     } -->


urlcolor: blue
geometry: "left=1cm,right=1cm,top=2cm,bottom=2cm"

header-includes:

- \usepackage{fancyhdr}
- \pagestyle{fancy}
- \fancyfoot{}
- \fancyhead{}
- \fancyfoot[R]{\thepage\ }
- \renewcommand{\headrulewidth}{2pt}
- \renewcommand{\footrulewidth}{2pt}
- \fancyhead[L]{CPE 203}
- \fancyhead[R]{Hadi Asemi}
- \fancyhead[C]{Java}
- \newlength\FHoffset
- \setlength\FHoffset{1cm}


---
\begin{titlepage}
	\begin{center}
		\line(1,0){300}\\
		[0.25in]
		\huge{\bfseries CPE203}\\
		[2mm]
		\line(1,0){300}\\
		[1.5cm]
		\textsc{\LARGE Java Class}\\
		[12.5cm]

		\textsc{\Large }\\
		[4cm]

	\end{center}
	\begin{flushright}
		\textsc{\large Hadi Asemi\\
		Jul 18,2020\\}
	\end{flushright}
\end{titlepage}
\tableofcontents
\thispagestyle{empty}
\cleardoublepage
\newpage
\setcounter{page}{1}
\thispagestyle{fancy}

# Definitions:

  * **OOP** is a programing technique that focuses on the data(=objects) and on the interfaces to that object.

  * **Object:** Is the instance of the class

  * **Object Class:** is the **_ultimate super class_**. Every class you ever make in Jave will automatically inherit from it.(equals, toString, and getClass)

  * **Classes:** A class is the template or blueprint from which objects are made.

    * Static variable:

      * Belong to the class

      * Accessed by: ClassName.VARIABLE_NAME
  * **Superclass:** class above another in a hierarchy of classses

  * **Subclass:** inherits form parent and is a version of the parent class
  * **Encapsulation(sometimes called information hiding):** is simply combining data and behavior in one package hiding the implementation details from the users of the objects.

  * **Instance variables:** are variables defined in a class, but outside the body of methods. Instance variables are filled when each object is instantiated and belong the object.
  * **Class Variables:** belongs to the class and the value in that variable is shared by every instance of the class by the class itself.

  * **Constructor:** set data's values

  * **Methods:** Manipulate and access data

  * **Public:** is keyword which declares a member's access as public.

  * **Private:** is a Java keyword which declares a member's access as private.

  * **Static:** object belongs specifically to the class, instead of instances of that class.

  * **Is-a:** inheritance/interfaces
  * **has-a:** composition/aggresgation

  Three key characteristics of objects:

  * **The object's behavior**

  * **The object's state**

  * **The object's identity**

# Array:

```Java
int[]array= new int[20]; // allocating memory for array. it will be fixed sized
array[0]=5; //declaring first element array

//for loop - if nums is Array
for (int i = 0; i < nums.length i++){
  //nums[i];
}

//for each loop
for (int i: nums){
  //do stuff with i
}

```
# ArrayList:

```Java
ArrayList<String>words=new ArrayList<String>();

ArrayList<Integer>num=new ArrayList<Integer>();

LinkedList<String> ll = new LinkedList<>();  

num.add(1);

num.get(0); // we need put index

//remove element base on index
num.remove(1);


//for loop - if nums is ArrayList
for (int i = 0; i < nums.size(); i++){
  //nums.get(i);
}

//for each loop
for (int i: nums){
  //do stuff with i
}

```

# HashMap:

```Java
Map<String,String>myMap=new HashMap<>();

// add key
myMap.put("Hadi","21");

// get the value of the key
myMap.get("Hadi");

// remove the key
myMap.remove("Hadi");

// clear whole Map
myMap.clear();

// get the size
myMap.size();

// Different way of loop
for (String name: myMap.keySet()){
  System.out.println(age);
}

for (String age: myMap.values()){
  System.out.println(age);
}

for(Map.Entry<String,String>entry:myMap.entrySet()){
  String key=entry.getKey();
  String value=entry.getValue();
}

```
## Example:

```Java

class Trainer{
    private String id;
    private String name;

  public  Trainer(String id, String name)
	{
		this.id = id;
		this.name = name;
	}
	public String getID() { return id; }
	public String getName() { return name; }
}
public static void main(String[]args){

  Map<String,Trainer> train=new HashMap<>();

  train.put("red",new Trainer("40","Hadi"));
  train.put("blue",new Trainer("401","Had"));
  train.put("Yellow",new Trainer("402","Ha"));
  train.put("black",new Trainer("403","H"));

  for(Map.Entry<String,Trainer>data:train.entrySet()){

    System.out.println("Color: "+(String)data.getKey()+" id: "+(String)data.getValue().getID());
  }

}
}
```
## Example:

```Java

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class ExampleMap
{
   public static List<String> highEnrollmentStudents(
      Map<String, List<Course>> courseListsByStudentName, int unitThreshold)
   {
      List<String> overEnrolledStudents = new LinkedList<>();

      /*
         Build a list of the names of students currently enrolled
         in a number of units strictly greater than the unitThreshold.
      */



      for(String name:courseListsByStudentName.keySet()){
         int sum=0;
         for(Course course:courseListsByStudentName.get(name)){
            sum+=course.getNumUnits();
         }
         // int unit=courseListsByStudentName.get(name).getNumUnits();
         if (sum>unitThreshold){
            overEnrolledStudents.add(name);
         }

      }

      return overEnrolledStudents;      
   }
}
```

# **Overriding:**

## **toString():**

```Java
  public String toString(){ return name;}
```

## **equals:**

```Java
public boolean equals(Object o){
  if (o==null){return false;}
  if (o.getClass()!=this.getClass()){return false;}
  Theater t=(Theater)o;
  return t.seatingCapacity==seatingCapacity && t.numberTicket==numberTicket && t.name.eqals(name);
}
```
**OR**

```Java
public boolean equals(Object o){
  if (o==null){return false;}
  if (o.getClass()!=this.getClass()){return false;}
  Theater t=(Theater)o;
	if(name==null)
		result=t.name==null;
	else
		result=t.name.equals(name);
  return result && t.seatingCapacity==seatingCapacity && t.numberTicket==numberTicket;
}
```


## Hash Code:

```Java
public int hashCode()
	{
			int hash = 1;

			hash = hash * 31 + studentLoans; //can leave since int
//cannot add double to int
			hash = hash * 31 + ((Double)gpa).hashCode();
			return hash;
	}

```

**OR**

```java
public int hashCode()
    {
        return Objects.hash(studentLoans, gpa);
    }
```

# Upcasting and Downcasting:

The right side should be less than or equal left side.

We can not instantiate the interface.
<!-- **Note:**

1. Every time down casting, it is possible the code crash on run time.(**CR**) -->

**Will it compile:**

* **Check the static types,** do they all match:

  * Are you only calling the methods of the static type?

  * Are you only passing in parameters of(or lower than) the expected static type.( You can  upcast here, but not implicity downcast)

  * Is the left side >= the right?

* Will it maybe crash:

  * Did you have to explicitly downcast to call a method.

  * Will it maybe work, but you don't know for sure because you didn't check?


# **Super and Subclass:**

```Java

public class Vehicle{

	private int maxSpeed=120;

	public Vehicle(int maxSpeed){
		this.maxSpeed=maxSpeed;
	}

	public void vroom(){
		Sytem.out.println("Vromm vrom")
	}
	// Override the equals method
	public boolean equals(Object o){
	  if (o==null){return false;}
	  if (o.getClass()!=this.getClass()){return false;}
	  Vehicle t=(Vehicle)o;
	  return t.maxSpeed==maxSpeed;
	}

	// Override toString method
	public String toString(){
		return "The Vehicle speed: "+ maxSpeed;
	}
}

public class Car extends Vehicle{
	private int doors;

	public Car(int doors,int maxSpeed){
		super(maxSpeed);
		this.doors=doors;
	}

	public void display(){
		System.out.println(super.maxSpeed)
	}

	public void vroom(){
		super.vrom();
	}
	// Override equals method
	public boolean equals(Object o){
		return super.equals(o) && ((Car)o).doors==doors;
	}

	// Override toString method
	public String toString(){
		return super.toString()+"The number of doors"+doors;
	}

}
```
# Comparable && Comparator:

```java
 // important note that Comparable is only input one Object
public class Student implements Comparable<Student>{

	private String lastName;
	private String firstName;
	private int age;
	private double gpa;

	public int compareTo(Student other){
		return lastName.compareTo(other.lastName);
	}
}

// Comparator implements two Objects
public class StudentAgeComparator implements Comparator<Student>{
   public int compare(Student s1, Student s2)
   {
   	  return s1.age() - s2.age(); //compare ascending order
   }
}

public class StudentGpaComparator implements Comparator<Student>
{
	//compare reverse order
   public int compare(Student s1, Student s2)
   {
   	  if (s1.gpa() >s2.gpa())
   	     return -1;
   	  else if (s1.gpa() < s2.gpa())
   	  	 return 1;
   	  else
   	  	 return 0;
   }
}
```

for sorting we have to methods:

```Java

Collections.sort.(studentList);

Arrays.sort(studentArray);

Collections.sort(studentList, new StudentGpaComparator()); // we can specify which Comparator we want to use

```

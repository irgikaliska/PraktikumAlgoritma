## Question 2.1.3
1. Name two characteristics of a class or object! 

Attributes: the properties that describe an object, Methods: the actions that an object can perform

2. Pay attention to the Mahasiswa class in Practicum 1, how many attributes do the Student class
   have? Mention what the attributes are

nim (String), nama (String), kelas (String), ipk (double)

3. How many methods does the class have? Mention what the methods are!

tampilkanInformasi(), ubahKelas(), updateIpk(), nilaiKinerja()

4. Pay attention to the method updateIpk contained in the Mahasiswa class. Modify the
   content of the method so that the GPA entered is valid, namely first checking whether the
   GPA entered is in the range of 0.0 to 4.0 (0.0 <= GPA <= 4.0). If the GPA is not in that range,
   the message is issued: "GPA is invalid. Must be between 0.0 and 4.0".

if (ipkBaru < 0.0 || ipkBaru > 4.0) {
System.out.println("GPA is invalid. Must be between 0.0 and 4.0");
} else {
ipk = ipkBaru;
}

5. Explain how the nilaiKinerja() method works in evaluating student performance, what
   criteria are used to determine the performance value, and what is returned by the
   nilaiKinerja() method?

if the gpa is less more than or equal to 3.5 then the method will return "Kinerja sangat baik", if gpa is more then or equal to 3.0 it will return "Kinerja baik", if the gpa is more than or equal to 2.0 then it will return "Kinerja cukup", and then if the gpa is less than 2.0 it will return "Kinerja kurang"

## Question 2.2.3

1. In the StudentMain class, indicate the line of program code used for the instance process!
   What is the name of the resulting object?

Mahasiswa14 mhs1 = new Mahasiswa14();

2. How do I access the attributes and methods of an object?

objectname.method/attributes;

3. Why are the output output results of the method tampilkanInformasi() first and second
   different?

because when we call the first one we haven't changed the data yet, but when we call the second one we already changed the data with the other methods

## Question 2.3.3

1. In the Mahasiswa class in practicum 3, indicate the program code line used to declare a
   parameterized constructor!

public Mahasiswa14(String nm, String nim, double ipk, String kls){
nama = nm;
this.nim = nim;
this.ipk = ipk;
kelas = kls;

2. Pay attention to the StudentMain class. What exactly does the following line of program do?

Creating a new object with the parameterized constructor

3. Remove the default constructor on the Mahasiswa class, and then compile and run the
   program. How did it turn out? Explain why this is the case!

the program will run into an error because if there is already a parameterized constructor java will not make a default constructor automatically

4. After instantiating the object, do the methods in the Mahasiswa class have to be accessed
   sequentially? Explain why!

No. Methods can be called in any order as needed. For example, calling updateIpk() before tampilkanInformasi() so the displayed data is already updated.

5. Create a new object with the name mhs<StudentName> using the parameterized constructor
   from the Mahasiswa class!

Mahasiswa14 mhs3 = new Mahasiswa14("irgi", "254107020009", 3.80, "TI 1I");
mhs3.tampilkanInformasi();

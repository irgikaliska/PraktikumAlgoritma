package Week14;

public class Student00 {
    String nim, name, className;
    double ipk;

    public Student00(){

    }

    public Student00(String nim, String name, String className, double ipk) {
        this.nim = nim;
        this.name = name;
        this.className = className;
        this.ipk = ipk;
    }

    void print(){
        System.out.println("NIM : " + nim);
        System.out.println("Name : " + name);
        System.out.println("Class : " + className);
        System.out.println("IPK : " + ipk);
    }
}

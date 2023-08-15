public class Employee{
    private String name;
    private int age;
    private double salary;
    
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public void displayInfo(){
        System.out.println("Name:"+name);
        System.out.println("age:"+age);
        System.out.println("salary:"+salary);
    }
    
    public static  class Main{
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.setName("John");
        emp.setAge(25);
        emp.setSalary(50000.0);
        emp.displayInfo();
    }
}
}


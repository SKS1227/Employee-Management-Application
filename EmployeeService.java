import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {
    HashSet<Employee> empset = new HashSet<Employee>();
    Employee emp1 = new Employee(101,"Raghu",26,"Developer","IT",25000);
    Employee emp2 = new Employee(102,"Arjun",29,"Tester","co",50000);
    Employee emp3 = new Employee(103,"Shive",25,"Intern","IT",20000);
    Employee emp4 = new Employee(104,"Raju",24,"Designer","IT",18000);

    Scanner sc = new Scanner(System.in);
    boolean found = false;
    int id;
    String name;
    int age;
    String department;
    String designation;
    double sal;

    public  EmployeeService(){
        empset.add(emp1);
        empset.add(emp2);
        empset.add(emp3);
        empset.add(emp4);
    }

    //View all employees
    public void viewAllEmps(){
        for (Employee emp :empset){
            System.out.println(emp);
        }
    }

    //View emp based on their id
    public void viewEmp(){
        System.out.println("Enter id: ");
        id = sc.nextInt();
        for (Employee emp :empset){
           if (emp1.getId()==id){
            System.out.println(emp);
            found =true;
           }
        }
        if (!found){
            System.out.println("Employee with this id not found");
        }
    }

    //Update the employee
    public void updateEmployee(){
        System.out.println("Enter id: ");
        id= sc.nextInt();
        boolean found= false;
        for (Employee emp:empset){
            if (emp.getId()==id){
                System.out.println("Enter name: ");
                name= sc.next();
                System.out.println("Enter new salary: ");
                sal=sc.nextDouble();
                emp.setName(name);
                emp.setSalary(sal);
                System.out.println("Updated Details of employee are: ");
                System.out.println(emp);
                found = true;
            }
        }
        if (found){
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee details updated successfully");
        }
    }


    //Delete emp
    public void deleteEmp(){
        System.out.println("Enter id");
        id = sc.nextInt();
        boolean found= false;
        Employee empdelete = null;
        for (Employee emp : empset){
            if (emp.getId()==id){
                empdelete= emp;
                found = true;
            }
        }
        if (!found){
            System.out.println("Employee is not present");
        }
        else {
            empset.remove(empdelete);
            System.out.println("Employee delated successfully");
        }

    }
    //Add Employee
    public void addEmp(){
        System.out.println("Enter id");
        id = sc.nextInt();
        System.out.println("Enter name");
        name= sc.next();
        System.out.println("Enter age");
        age= sc.nextInt();
        System.out.println("Enter designation");
        designation = sc.next();
        System.out.println("Enter Department");
        department=sc.next();
        System.out.println("Enter Sal");
        sal = sc.nextDouble();

        Employee emp = new Employee(id,name,age,designation,department,sal);

        empset.add(emp);
        System.out.println(emp);
        System.out.println("Employee added successfully");
    }

 }

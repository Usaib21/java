public class EmployeeStaticTest {
    public static void main(String[] args){
        Employee[] obj=new Employee[4];
        obj[0] = new Employee("zameer",100);
        obj[1] = new Employee("hilal",200);
        obj[2] = new Employee("tufail",50);
        for (Employee e:obj){
            e.setId();
            System.out.println("name=" +e.getName() + "id=" + e.getId() + "salary=" + e.getSalary());

        }
        int n = Employee.getNextId();
        System.out.println("Next avaliable id=" + n);
    }
}

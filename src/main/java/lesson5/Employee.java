package lesson5;

public class Employee {
    String name;
    String availability;
    String email;
    String phone;
    int salary;
    int age;


    public Employee(String name, String availability, String email, String phone, int salary, int age) {


        this.name = name;
        this.availability = availability;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void outputInfo() {
        System.out.println("name: " + name + " // availability : " + availability + " //email: " + email
                + " //  phone: " + phone + " // salary: " + salary + " // age: " + age);
    }

    public int outputAge() {
        return age;
    }

    public static void main(String[] args) {
       /* Employee employee1= new Employee("Иванов Иван", "менеджер", "33333@bk.ru",
                "8965555555",100000, 38 );
        employee1.outputInfo();*/

        System.out.println("Список сотрудников:");

        Employee[] employee = new Employee[5];

        employee[0] = new Employee("Иванов Иван", "менеджер", "33333@bk.ru",
                "8965555555", 100000, 58);
        employee[1] = new Employee("Петров Пётр", "ассистент", "33123@bk.ru",
                "8965236555", 50000, 22);
        employee[2] = new Employee("Истрати Алёна", "повар", "85233@bk.ru",
                "8966387555", 65000, 55);
        employee[3] = new Employee("Козлов Михаил", "ассистент", "11133@bk.ru",
                "8965558955", 50000, 19);
        employee[4] = new Employee("Сидоренко Мария", "администратор", "31983@bk.ru",
                "8965516165", 45000, 30);


        for (Employee elem : employee)
            if (elem.outputAge() > 40)
                elem.outputInfo();
    }
}


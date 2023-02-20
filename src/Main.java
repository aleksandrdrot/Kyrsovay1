public class Main {
    public static Employee[] employee = new Employee[10];
    public static int count = 0;

    public static void main(String[] args) {

        addEmployee("Александр","Пушкин","Сергеевич",12547,2);
        addEmployee("Александр","Гришин","Леонидович",21535,1);
        addEmployee("Максим","Пупков","Александрович",12687,2);
        printOut();
        allSalary();
        minSalary();
        maxSalary();
        averageSalary();
        fioEmployee();

    }

        public static void addEmployee(String firstName, String lastName, String middleName, int salary, int department) {
            if (count >= employee.length) {
                System.out.println("Нельзя добавить сотрудника, закончилось место");
            }
            Employee newEmployee = new Employee(firstName,lastName,middleName,salary,department);
            employee[count++] = newEmployee;
        }

        public static void printOut(){
            for (int i = 0;i < count;i++){
                employee[i].print();
            }
        }

        public static void allSalary(){
            int salary = 0;
            for (int i = 0; i < count; i++){
                salary += employee[i].getSalary();
            }
            System.out.println("\nСумма необходимая для зарплаты - "+ salary + "\n");
        }

        public static void minSalary() {
            int index = 0;
            int salary = employee[0].getSalary();
            for (int i = 0; i < count;i++) {
                    if (salary > employee[i].getSalary()) {
                        salary = employee[i].getSalary();
                        index = i;
                    }
            }
            System.out.println("Наименьшая зарплата у:");
            employee[index].print();
        }

        public static void maxSalary() {
            int index = 0;
            int salary = employee[0].getSalary();
            for (int i = 0; i < count;i++) {
                    if (salary < employee[i].getSalary()) {
                        salary = employee[i].getSalary();
                        index = i;
                    }
            }
            System.out.println("Наибольшая зарплата у:");
            employee[index].print();
        }

        public static void averageSalary(){
            float salary = 0f;
            for (int i = 0; i < count; i++){
                salary += employee[i].getSalary();
            }
            System.out.println("Средняя зарплата: "+ salary/count + "\n");
        }

        public static void fioEmployee(){
            for (int i = 0;i < count;i++){
                System.out.println(employee[i].getFirstName() +" "+ employee[i].getLastName() +" "+ employee[i].getMiddleName());
            }
        }
}
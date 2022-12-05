public class Worker {
    String name;
    String post;
    String email;
    String phone_number;
    int salary;
    int age;
    public Worker(String name, String post, String email, String phone_number, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }

    public String toString(){
        return String.format("Name: %s \tPost: %s \nEmail: %s \t Phone Number: %s \n Salary: %d \t Age: %d \n",
                name, post, email, phone_number, salary, age);}

    public void print(){
        System.out.println(this);
    }

    public static void main(String[] args)  {
        Worker[] persArray = new Worker[5];
        persArray[0] = new Worker("Иван Иванов", "Главный редактор", "ii@mail.ru", "+79999999999", 100000, 75);
        persArray[1] = new Worker("Антон Пушкин", "Репортер", "ap@gmail.com", "+79999999998", 80000, 65);
        persArray[2] = new Worker("Александр Чехов", "Уборщик", "ac@mailbox.com", "+79999999997", 60000, 55);
        persArray[3] = new Worker("Эрнест Уайлд" , "Разработчик", "ew@mail.ru", "+79999999996", 40000, 45);
        persArray[4] = new Worker("Оскар Хемингуэй", "Критик", "oh@gmail.com", "+79999999995", 20000, 35);

        for (int i = 0; i < persArray.length; i++)
            if (persArray[i].age > 40) persArray[i].print();
    }
}
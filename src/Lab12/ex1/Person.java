package Lab12.ex1;

public class Person {
    private String name, surname, patronymic;

    public Person(String surname){
        this.surname=surname;
    }

    public Person(String name, String surname, String patronymic){
        this.name=name;
        this.surname=surname;
        this.patronymic=patronymic;
    }

    public String getFIO(){
        StringBuilder str = new StringBuilder(surname);
        if (!name.equals(""))
            str.append(" ").append(name);
        if (!patronymic.equals(""))
            str.append(" ").append(patronymic);
        return str.toString();
    }

    public static void main(String[] args){
        Person p1 = new Person("Alexander", "Petrov", "Konstantinovich");
        Person p2 = new Person("", "Petrov", "Konstantinovich");
        Person p3 = new Person("", "Petrov", "");

        System.out.println(p1.getFIO());
        System.out.println(p2.getFIO());
        System.out.println(p3.getFIO());
    }

}

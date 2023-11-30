package class_interface;

public class Persona implements Comparable {

    private int age;
// constructor que establece la edad

    public Persona(int age){
        this.age = age;

    }
    public int getAge(){
        return this.age;
    }

    public void showAge(){
        System.out.println(this.age);
    }

    @Override
    public int compareTo(Object o) {
////        casting
//        Persona p = (Persona) o;
////        compare ages
//        if(this.age < p.getAge()){
//            return -1,
//        }
//        if(this.age > p.getAge()){
//            return 1;
//        }
//
//        return 0;

        return this.age - ((Persona) o).getAge();
    }
}

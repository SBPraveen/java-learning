import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

class Student{
    int age;
    String name;
    public Student(int age, String name){
        this.name = name;
        this.age = age;
    }
    public void show(){
        System.out.println("Name: "+this.name+" Age: "+this.age);
    }
}

//Comparable
class Army implements Comparable<Army>{
    int age;
    String name;
    public Army(int age, String name){
        this.name = name;
        this.age = age;
    }
    public void show(){
        System.out.println("Name: "+this.name+" Age: "+this.age);
    }
    @Override
    public int compareTo(Army that) {
        if(this.age> that.age)
            return 1;
        else    
            return -1;
    }
}

public class Les16 {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<Integer>();
        // The default value in collection is object
        nums.add(5);
        nums.add(6);
        nums.add(7);
        for (int n : nums) {
            System.out.println(n);
        }

        // ||List
        // Collection doesnt support index values use List if we want to access array
        // elements using index.
        List<Integer> nums1 = new ArrayList<>();
        // The default value in collection is object
        nums1.add(77);
        nums1.add(55);
        nums1.add(66);
        nums1.add(77);
        // The .get method takes index as input and returns an element.
        System.out.println(nums1.get(1));
        System.out.println(nums1.indexOf(66));
        System.out.println("Before sorting" + nums1);
        //sort array
        Collections.sort(nums1);
        System.out.println("After sorting "+nums1);

        // ||Set
        // HashSet - Duplicates are removed
        Set<Integer> s1 = new HashSet<>();
        s1.add(66);
        s1.add(555);
        s1.add(515);
        s1.add(999);
        s1.add(777);
        s1.add(777);
        System.out.println(s1);

        // TreeSet - Sorted and duplicates are removed
        Set<Integer> s2 = new TreeSet<>();
        s2.add(66);
        s2.add(555);
        s2.add(515);
        s2.add(999);
        s2.add(777);
        s2.add(777);
        System.out.println(s2);

        // || Map
        // HashMap and HashTable are similar and the only difference is HashTable is
        // synchronized(Thread safe)
        Map<String, Integer> m1 = new HashMap<>();
        m1.put("Praveen", 21);
        m1.put("Resika", 25);
        m1.put("Shanthi", 51);
        System.out.println(m1);
        System.out.println(m1.get("Resika"));

        //Array of Objects
        Student stu1 = new Student(24, "Praveen");
        Student stu2 = new Student(24, "Keerthana");
        Student stu3 = new Student(8,"Tharun");
        Student stu4 = new Student(54, "Shanthi");

        List <Student> stuArr = new ArrayList<>();
        stuArr.add(stu1);
        stuArr.add(stu2);
        stuArr.add(stu3);
        stuArr.add(stu4);

        //Display the students
        for(Student s:stuArr){
            s.show();
        }

        //Creating a comparator for sorting the students
        Comparator<Student> comp = new Comparator<Student>() {
            public int compare(Student i, Student j){
                if(i.age > j.age){
                    return 1;
                }
                return -1;
            }
        };

        //Sort the students
        Collections.sort(stuArr, comp);
        //Display the students after sorting
        System.out.println("------------------------------------");
        for(Student s:stuArr){
            s.show();
        }

        //Comparable
        List <Army> armyArr = new ArrayList<>();
        Army army1 = new Army(24, "Praveen");
        Army army2 = new Army(24, "Keerthana");
        Army army3 = new Army(8,"Tharun");
        Army army4 = new Army(54, "Shanthi");
        armyArr.add(army1);
        armyArr.add(army2);
        armyArr.add(army3);
        armyArr.add(army4);
        Collections.sort(armyArr);
        System.out.println("Army after sorting-------------");
        for(Army s:armyArr){
            s.show();
        }
    }
}

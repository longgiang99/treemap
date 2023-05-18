package hashmap_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
            Student student1 = new Student("nam1",21,"hanoi");
            Student student2 = new Student("nam2",22,"hanoi");
            Student student3 = new Student("nam3",23,"hanoi");
            Student student4 = new Student("nam4",24,"hanoi");
        Map<Integer, Student> studentMap = new HashMap<Integer,Student>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student4);
        for (Map.Entry<Integer,Student> student: studentMap.entrySet()){
            System.out.println(student.toString());
        }
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        for(Student student : students){
            System.out.println(student.toString());
        }

    }
}

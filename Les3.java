class Student {
    int roll;
    String name;
    int marks;
}

public class Les3 {
    public static void main(String a[]) {

        // Array def 1
        int nums[] = { 11, 22, 33, 44 };
        nums[1] = 77;

        // normal loop
        for (int i = 0; i < nums.length; i++) {
            System.out.println("nums : " + nums[i]);
        }

        // Array def 2 => All the 4 elements are assigned 0
        int nums2[] = new int[4];
        nums2[0] = 10;

        // ||for each loop
        for (int n : nums2) {
            System.out.println("nums2 : " + n);
        }

        // nested arrays
        int nums3[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        int nums4[][] = new int[3][2];
        nums3[0][0] = 11;
        nums4[0][1] = 12;
        for (int subArr[] : nums3) {
            for (int val : subArr) {
                System.out.print("nums3 : " + val + " ");
            }
            System.out.println();
        }

        // ||jagged array
        // this is a nested array whose internal array size we need not specify ie. the
        // internal array can be of variable size.
        int nums5[][] = new int[3][];
        nums5[0] = new int[3];
        nums5[1] = new int[6];
        nums5[2] = new int[4];

        // Array of objects
        Student s1 = new Student();
        s1.roll=111;
        s1.name="yesbee";
        s1.marks=99;
        Student s2 = new Student();
        s2.roll=222;
        s2.name="bbb";
        s2.marks=39;
        Student s3 = new Student();
        s3.roll=333;
        s3.name="aaa";
        s3.marks=78;

        Student stuArr[] = new Student[3];
        stuArr[0] = s1;
        stuArr[1] = s2;
        stuArr[2] = s3;

        for(Student stud: stuArr){
            System.out.println(stud.name + " : " + stud.marks);
        }

    }
}

package class1;

public class ClassStart1 {
    public static void main(String[] args) {
//        String name = "학생1";
//        int age = 15;
//        int studentGrade = 90;
//
//        String name2 = "학생2";
//        int age2 = 16;
//        int studentGrade2 = 80;
//
//        String name3 = "학생3";
//        int age3 = 16;
//        int studentGrade3 = 80;

        // -----------------------

        String[] name = {"학생1", "학생2"};
        int[] age = {15, 16};
        int[] grade = {90, 80};

        for(int i = 0; i < name.length; i++) {
            System.out.println("이름 : " + name[i] + " 나이 : " + age[i] + " 점수 : " + grade[i]);

        }
    }
}

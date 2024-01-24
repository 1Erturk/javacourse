public class Main {
    public static void main(String[] args) {
        String[] students= new String[4];
        students[0]="Engin";
        students[1]="Ertan";
        students[2]="icardi";
        students[3]="Muslera";

        for (int i = 0; i <students.length ; i++) {
            System.out.println(students[i]);
        }

        System.out.println("-------------------------------------");
        for (String student:students) {
            System.out.println(student);
        }
    }
}
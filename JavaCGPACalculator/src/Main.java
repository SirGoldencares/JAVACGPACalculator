import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Total Number Courses Taken: ");
        int noOfCourses = input.nextInt(), index = 0;
        CourseInformation[] data = new CourseInformation[noOfCourses];

        while (index < noOfCourses)
        {
            try {
                CourseInformation course = new CourseInformation();

                input = new Scanner(System.in);
                System.out.printf("Entry: %d\n", index + 1);
                System.out.printf("Enter the Course %d Title & code: ", index + 1);
                course.setCourseCode(input.nextLine());

                input = new Scanner(System.in);
                System.out.print("Enter Assigned Course Unit (Positive Values only e.g 4): ");
                int unit = input.nextInt();
                if (unit < 0) {
                    throw new Exception();
                }
                course.setCourseUnit(unit);

                input = new Scanner(System.in);
                System.out.print("Enter the Course Score obtained: ");
                int score = input.nextInt();
                while (score < 0 || score > 100) {
                    System.out.print("Enter a score greater than 0 and less than 100: ");
                    score = input.nextInt();
                }
                course.setCourseScore(score);

                data[index] = course;
                index++;
            } catch (Exception ex) {
                System.out.println(" Wrong value, Re-Enter Course Parameters!!");
            }
        }
        PrintInformation print = new PrintInformation();
        print.printTable(data);
    }
}

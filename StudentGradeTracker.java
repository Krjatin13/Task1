import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.println("Enter student grades (type -1 to stop):");
        while (true) {
            System.out.print("Enter grade: ");
            int grade = scanner.nextInt();
            if (grade == -1) {
                break;
            }
            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade! Please enter a number between 0 and 100.");
                continue;
            }
            grades.add(grade);
        }

        if (grades.isEmpty()) {
            System.out.println("No grades entered.");
        } else {
            System.out.println("Average Grade: " + calculateAverage(grades));
            System.out.println("Highest Grade: " + getHighest(grades));
            System.out.println("Lowest Grade: " + getLowest(grades));
        }
        scanner.close();
    }

    public static double calculateAverage(ArrayList<Integer> grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public static int getHighest(ArrayList<Integer> grades) {
        int highest = grades.get(0);
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    public static int getLowest(ArrayList<Integer> grades) {
        int lowest = grades.get(0);
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}

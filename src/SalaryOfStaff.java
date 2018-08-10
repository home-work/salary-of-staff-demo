import java.util.Scanner;

public class SalaryOfStaff {
    public static void main(String[] args) {
        //Nhập vào năm làm việc, hệ số lương của nhân viên
        int yearOfWork;
        float indexOfSalary;
        float salary;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tTÍNH LƯƠNG NHÂN VIÊN");
        System.out.println("Nhập vào số năm làm việc: ");
        yearOfWork = scanner.nextInt();
        System.out.println("Nhập vào hệ số lương: ");
        indexOfSalary = scanner.nextInt();
    }
}

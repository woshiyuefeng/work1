public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Staff staffone= new Staff();
        staffone.dispalystaffSalarySum();
        staffone.displaystaffCountNumber();
        Staff stafftwo = new Staff(2,"Alpha",22);
        stafftwo.setStaffSalary(4000);
        stafftwo.setStaffIDNumber("12345678");
        stafftwo.setStaffCountNumber(10);
        stafftwo.setStaffSalarySum(140000);
        stafftwo.addSalary(160000);
        stafftwo.redSalary(8000);
    }
}

public class Staff {
    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public int getStaffAge() {
        return staffAge;
    }

    public void setStaffAge(int staffAge) {
        this.staffAge = staffAge;
    }

    public float getStaffSalary() {
        return staffSalary;
    }

    public void setStaffSalary(float staffSalary) {
        this.staffSalary = staffSalary;
    }

    public String getStaffIDNumber() {
        return staffIDNumber;
    }

    public void setStaffIDNumber(String staffIDNumber) {
        this.staffIDNumber = staffIDNumber;
    }

    public int getStaffCountNumber() {
        return staffCountNumber;
    }

    public void setStaffCountNumber(int staffCountNumber) {
        this.staffCountNumber = staffCountNumber;
    }

    public float getStaffSalarySum() {
        return staffSalarySum;
    }

    public void setStaffSalarySum(float staffSalarySum) {
        this.staffSalarySum = staffSalarySum;
    }

    //initial properties;
    int staffID;
    String staffName;
    int staffAge;
    float staffSalary;
    String staffIDNumber;
    int staffCountNumber;
    float staffSalarySum;

    public Staff() {
    }

    public Staff(int staffID, String staffName, int staffAge) {
        this.staffID = staffID;
        this.staffName = staffName;
        this.staffAge = staffAge;
        try {
            if (new Integer(staffID) == null || staffName == null || new Integer(staffAge) == null) {
                ErrorCatchDIV errorNull = new ErrorCatchDIV("staffID,staffName or staffAge with value of NULL");
                throw errorNull;
            }
        }catch(ErrorCatchDIV errorNull){
            System.out.println(errorNull);
        }
        try{
            if (staffAge<18){
                throw new ErrorCatchDIV("staffAge<18");
            }
        }catch(Exception errorAgeLow){
            System.out.println(errorAgeLow);
        }
        try{
            if (staffAge>60){
                throw new ErrorCatchDIV("staffAge>60");
            }
        }catch(Exception errorAgeHigh){
            System.out.println(errorAgeHigh);
        }

    }

    public Staff(float staffSalary, String staffIDNumber) {
        this.staffSalary = staffSalary;
        this.staffIDNumber = staffIDNumber;
        try{
            if (staffSalary<600.0){
                throw new ErrorCatchDIV("staffSalary<600");
            }
        }catch(Exception errorSalLow){
            System.out.println(errorSalLow);
        }


    }

    public void addSalary(float salaryIncrement) {
        try{
            if((staffSalary+salaryIncrement)>staffSalarySum)
                throw new ErrorCatchDIV("staffSalary>staffSalarySum");

        }catch(ErrorCatchDIV errorSalSumHigh){
            System.out.println(errorSalSumHigh);
        }
        this.staffSalary+=salaryIncrement;
    }

    public void redSalary(float salaryReduction){
        try{
            if ((staffSalary-salaryReduction)<=600){
                throw new ErrorCatchDIV("staffSalary<=600");
            }
        }catch(ErrorCatchDIV errorSalLow){
            System.out.println(errorSalLow);
        }
        this.staffSalary-=salaryReduction;
    }

    public void dispalystaffSalarySum(){
        try{
            if ((staffSalarySum)<=0){
                throw new ErrorCatchDIV("staffSalary<=0");
            }
        }catch(ErrorCatchDIV salSumisZero ){
            System.out.println(salSumisZero);
        }
    }
    public void displaystaffCountNumber(){
        try{
            if ((staffCountNumber)<=0){
                throw new ErrorCatchDIV("staffCountNumber<=0");
            }
        }catch(ErrorCatchDIV staffCountisZero ){
            System.out.println(staffCountisZero);
        }
    }
}

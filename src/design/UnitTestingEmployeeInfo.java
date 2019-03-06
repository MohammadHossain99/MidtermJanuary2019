package design;

import org.testng.Assert;

public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.
        EmployeeInfo test = new EmployeeInfo();

        Assert.assertEquals( test.calculateSalary(96000),96000);

        Assert.assertEquals(test.employeeHour(8,7),56);

        Assert.assertEquals(EmployeeInfo.calculateEmployeeBonus(5),0);

        test.numberOfDepartment(3,5);


        Assert.assertEquals(GeneralOfficer.gOfficer.resposibiities(),12000);

        Assert.assertEquals( EmployeeInfo.calculateEmployeePension(80000),80800);

    }
}

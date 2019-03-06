package design;

import java.util.*;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/

	public static void main(String[] args) {


		EmployeeInfo.employeeBio();

		System.out.println("***");
		new EmployeeInfo(40, 500, "Wells Fargo");
		System.out.println("***");
		EmployeeInfo.calculateEmployeeBonus(5);

		EmployeeInfo empInfo = new EmployeeInfo();
		empInfo.assignDepartment();
		empInfo.oldPension(140000.00);
		empInfo.calculateSalary(5);
		empInfo = new EmployeeInfo("", 0);

		int id = empInfo.employeeId();
		String name = empInfo.employeeName();
		System.out.println(name + " has id number of :" + id);

		Employee.dentalCare(80000);

		EmployeeData ed = new EmployeeInfo();

		ed.numberOfDepartment(3, 5);

		ed.averageSalary(500, 100000000);

		double em = EmployeeInfo.calculateEmployeePension(800000);
		System.out.println(em);

		System.out.println();
		GeneralOfficer.gOfficer.getInstance().resposibiities();



		Scanner sc = new Scanner(System.in);
		List<String> gmSnumber = new ArrayList<>();
		gmSnumber.add("Mike -> 234-567-9899");
		gmSnumber.add("Bob -> 234-567-8754");
		gmSnumber.add("JHon -> 643-256-8345");

		List<String> costomerCare = new ArrayList<String>();
		costomerCare.add("Account Departments");
		costomerCare.add("Loan Department");
		costomerCare.add("Cradit card Info");

		List<String> genaralInfo = new LinkedList<>();
		genaralInfo.add("Students loan");
		genaralInfo.add("Business Loan");
		genaralInfo.add("Mordgade Loan");

		HashMap<Integer, List<String>> mp = new HashMap<>();
		mp.put(1, gmSnumber);
		mp.put(2, costomerCare);
		mp.put(3, genaralInfo);


		System.out.println(" press 0 for the all list of service and Departments");
		System.out.println(" press 1 for All general Manager Phone numbers");
		System.out.println(" press 2 for Customer care service");
		System.out.println(" press 3 for more General Information");

		int num = sc.nextInt();

		if ((num >= 0) && (num < 4)) {

			if (num == 0) {
				for (Map.Entry<Integer, List<String>> m : mp.entrySet()) {
					System.out.println(m.getKey() + "  " + m.getValue());
				}
			}

			if (num == 1) {
				System.out.println(mp.get(1));
			}
			if (num == 2) {
				System.out.println(mp.get(2));
			}
			if (num == 3) {
				System.out.println(mp.get(3));
			}


		} else {
			System.out.println("Invalid Entry");
		}
	}


}




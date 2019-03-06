package design;

import java.util.Scanner;

import java.util.*;

public class EmployeeInfo extends EmployeeData {
	public int employeeId;
	public String name;

	Scanner sce = new Scanner(System.in);
	/*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
	 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
	 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
	 * go to FortuneEmployee class to apply all the fields and attributes.
	 *
	 * Important: YOU MUST USE the
	 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
	 * Use all kind of keywords(super,this,static,final........)
	 * Implement Nested class.
	 * Use Exception Handling.
	 *
	 */

	/*
	 * declare few static and final fields and some non-static fields
	 *
	 */

	public EmployeeInfo(int number,int numberOfEmployee,String name){
		super(number,numberOfEmployee,name);
		int result= numberOfEmployee*number;
		System.out.println(name.toUpperCase()+" has total of "+result+" employee in total of "+number+" branches !!");

	}
	static String companyName;

	public static void employeeBio() {

		BaseClass bc = new BaseClass();

		bc.setCompanyName("Chase");
		bc.setName("John");
		bc.setID(100);

		System.out.println(bc.getName().toUpperCase() + " workes for " + bc.getCompanyName().toUpperCase()
				+ " company for long time " +
				"his ID is " + bc.getID());

	}

	/*
	 * You must implement the logic for below 2 methods and
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */

	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo() {
	}

	/**
	 * This is called constructor Over Loding;
	 *
	 * @param employeeId
	 */
	public EmployeeInfo(int employeeId) {
		this.employeeId = employeeId;
		System.out.println("Employee id is : " + employeeId);
	}

	public EmployeeInfo(String name, int employeeId) {
		this.name = name;
		this.employeeId = employeeId;


		System.out.println(name + " is been working in the company his id is " + employeeId);

	}

	@Override
	public void compensation() {
		System.out.println("The total of compensation are depend on the yearly salary");

	}

	//OverRide Method from the inter face
	public int employeeId() {
		int employeeId = 0;
		sce = new Scanner(System.in);
		System.out.println("Please enter the Employee Id number : ");
		this.employeeId = employeeId;
		employeeId = sce.nextInt();
		return employeeId;
	}

	//overRide method from the Inerface
	public String employeeName() {
		System.out.println(" please enter employee name ");

		String name = "";
		this.name = name;
		name = sce.next();
//        sce.close();
		return name;
	}

	//method from interface
	public void assignDepartment() {
		System.out.println("assign Department is needed ");
	}

	public int calculateSalary(int salary) {
		int month, week;

		week = 400 * 5;
		month = week * 4;
		salary = month * 12;
		System.out.println("calculate salary for the employee is " + salary);

		return salary;
	}

	public void benefitLayout() {

		System.out.println("After having 90 days of consisting 15000 in the account will get 250 dollar bonus");
	}

	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 *
	 */
	public static int calculateEmployeeBonus(int numberOfYearsWithCompany) {
		numberOfYearsWithCompany = 0;
		double salary = 0;
		int bonus = 0;

		if (numberOfYearsWithCompany == 10) {
			bonus = (int) (salary * .10);
		} else if (numberOfYearsWithCompany == 8) {
			bonus = (int) (salary * .8);
		} else if (numberOfYearsWithCompany == 5) {
			bonus = (int) (salary * .5);
		} else if (numberOfYearsWithCompany == 3) {
			bonus = (int) (salary * .3);
		} else {
			System.out.println("There is no bonus without havig a good performance !!");
		}
		System.out.println("Total bonus of $" + bonus + " Employee gets based on their performance in ");
//        int total = 0;

		return bonus;
	}

	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 *
	 */
	public static int calculateEmployeePension(double salary) {
		int totalPension = 0;

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Please enter start date in format (example: May,2015): ");
			String joiningDate = sc.nextLine();
			System.out.println("Please enter today's date in format (example: August,2017): ");
			String todaysDate = sc.nextLine();
			String convertedJoiningDate = DateConversion.convertDate(joiningDate);
			String convertedTodaysDate = DateConversion.convertDate(todaysDate);

			String joinDate = convertedJoiningDate.substring(convertedJoiningDate.length() - 4, convertedJoiningDate.length());
			String toDate = convertedTodaysDate.substring(convertedTodaysDate.length() - 4, convertedJoiningDate.length());

			int joined = Integer.parseInt(joinDate);
			int today = Integer.parseInt(toDate);
			int totalWorkYear = today - joined;


			if (totalWorkYear >= 5) {
				totalPension = (int) (salary * 0.25);
			} else if (totalWorkYear == 4) {
				totalPension = (int) (salary * 0.20);
			} else if (totalWorkYear == 3) {
				totalPension = (int) (salary * 0.15);
			} else if (totalWorkYear == 2) {
				totalPension = (int) (salary * 0.10);
			} else if (totalWorkYear == 1) {
				totalPension = (int) (salary * 0.05);
			} else if (totalWorkYear == 0) {
				totalPension = 0;
			} else {
				System.out.println("No job No salary !!!!!!!");
			}
			System.out.println(totalPension + " is your yearly bounus enjoy !");


		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}


		return totalPension;

	}

	/**
	 * This is nasted class as we know class inside another class
	 * called nested class.
	 */
	private static class DateConversion {

		public DateConversion() {
		}

		public DateConversion(Months months) {
		}

		public static String convertDate(String date) {
			String[] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 7;
					break;
				case August:
					date = 8;
					break;
				case September:
					date = 9;
					break;
				case October:
					date = 10;
					break;
				case November:
					date = 11;
					break;
				case December:
					date = 12;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}


	}

}

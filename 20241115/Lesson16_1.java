//package java819.sixteen;

import javax.swing.JOptionPane;

public class Lesson16_1 {

	public static void main(String[] args) {
		Engineer emp1=new Engineer("周杰倫","A123456789",100000);
		emp1.displayInformation();
		emp1.raiseSalary(5000);
		emp1.addSkill("JAVA");
		emp1.addSkill("PYTHON");
		System.out.println("=".repeat(50));
		emp1.displayInformation();
		System.out.println("=".repeat(50));
		Manager emp2=new Manager("張惠妹","B123456789",80000,"總部");
		emp2.displayInformation();
	}

}

//Employee -- begin
class Employee {
	public static int nextID = 1;
	private int empID;
	private String name;
	private Object ssn;
	private double salary;

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object getSsn() {
		return ssn;
	}

	public void setSsn(Object ssn) {
		this.ssn = ssn;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	// 設值,取值--end
	// 建構子--begin
	public Employee(String name, String ssn, double salary) {
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
		this.empID = nextID++;
	}
	// 建構子--end
	public void displayInformation() {
		System.out.println("員工編號:"+empID);
		System.out.println("身份證號:"+ssn);
		System.out.println("員工姓名:"+name);
		System.out.println("員工薪資:"+salary);
	}
	//加薪方法
	public void raiseSalary(double increase) {
		if(increase>0) {
			salary+=increase;
		}
		else
			JOptionPane.showMessageDialog(null, "加薪不能小於等於0");
	}
}
//Employee -- end

//Engineer--begin

class Engineer extends Employee {
	private String skills[] = new String[5];
	private int skillCount;

	public Engineer(String name, String ssn, double salary) {
		super(name, ssn, salary);
	}

	@Override
	public void displayInformation() {
		super.displayInformation();
		System.out.println("\n擁有技能如下:");
		for (String s : skills) {
			if (s != null)
				System.out.println(s);
		}
	}

	// 添加技能的方法
	public void addSkill(String skill) {
		if (skillCount < 5) {
			skills[skillCount++] = skill;
		} else
			JOptionPane.showMessageDialog(null, "技能最多只能添加5項");
	}

}

//Engineer--end

//Manager--begin
class Manager extends Employee{
	private String deptName;
	public Manager(String name, String ssn, double salary,String deptName) {
		super(name, ssn, salary);
		this.deptName=deptName;

	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public void displayInformation() {
		super.displayInformation();
		System.out.println("管理部門:"+deptName);

	}

}


//Manager--end

//Director--begin
class Director extends Manager{
	private double budget;
	public Director(String name, String ssn, double salary, String deptName,double budget) {
		super(name, ssn, salary, deptName);
		this.budget=budget;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	@Override
	public void displayInformation() {
		super.displayInformation();
		System.out.println("管理部門:"+super.getDeptName());
		System.out.println("管理預算:"+budget);

	}


}
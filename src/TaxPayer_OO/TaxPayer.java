package TaxPayer_OO;

public class TaxPayer {

	private double salaryIncome;
	private double serviceIncome;
	private double capitalIncome;
	private double healthSpending;
	private double educationSpending;

	public TaxPayer() {

	}

	public TaxPayer(double salaryIncome, double serviceIncome, double capitalIncome, double healthSpending,
			double educationSpending) {

		this.salaryIncome = salaryIncome;
		this.serviceIncome = serviceIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}

	public double getSalaryIncome() {
		return salaryIncome ;
	}

	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public double getServiceIncome() {
		return serviceIncome;
	}

	public void setServiceIncome(double serviceIncome) {
		this.serviceIncome = serviceIncome;
	}

	public double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(double educationSpending) {
		this.educationSpending = educationSpending;
	}

	public double salaryTax() {
		
		double salaryPerMounth = getSalaryIncome()/12;
		if (salaryPerMounth >= 3000 && salaryPerMounth <= 5000) {
			return getSalaryIncome() * 0.1;
		} else if (salaryPerMounth>= 5000) {
			return getSalaryIncome() * 0.2;
		}
		return 0;

	}

	public double servicesTax() {

		if (getServiceIncome() != 0 && getServiceIncome() > 0) {
			return getServiceIncome() * 0.15;
		}
		return 0;

	}

	public double capitalTax() {
		
		if (getCapitalIncome() != 0 && getCapitalIncome() > 0) {
			return getCapitalIncome()*0.20;
		}
		return 0;

	}

	public double grossTax() {
		return salaryTax() + servicesTax() + capitalTax();
	}

	public double taxRebate() {
		double sumMaximumDeductible = grossTax()*0.3;
		double sumMedicalEducation = getHealthSpending() + getEducationSpending();
		
		if (sumMedicalEducation< sumMaximumDeductible) {
			return sumMedicalEducation;
		}
		else {
			return sumMaximumDeductible;
		}
		
	}

	public double netTax() {
		return  grossTax()-taxRebate();
	}

	@Override
	public String toString() {	
		return "\nImposto bruto total: " + String.format("%.2f", grossTax())  + 
		"\nAbatimento: " + String.format("%.2f",taxRebate()) +
		"\nImposto devido: " + String.format("%.2f",netTax());
	}
}

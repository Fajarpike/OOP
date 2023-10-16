package application;

import data.Company;

public class CompanyAPP {
    public static void main(String[] args) {
        
        Company company = new Company();
        company.setName("Pt. Lintas Arta");
        System.out.println(company.getName());

        Company.Employee employee = company.new Employee();
        employee.setName("Fajar");
        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

    }
    
}

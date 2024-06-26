package programmer.zaman.now.application;

import programmer.zaman.now.data.Company;

public class NestedApp {
    public static void main(String[] args) {

        Company company = new Company();
        company.setName("Adnan Company");

        Company.Employee employee = company.new Employee();
        employee.setName("Adnan Employee");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        Company company2 = new Company();
        company2.setName("Belum Ada");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("Joko");

        System.out.println(employee2.getName());
        System.out.println(employee2.getCompany());

    }
}

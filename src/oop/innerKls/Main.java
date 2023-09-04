package oop.innerKls;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        company.setNama("RA Darul Amal");

        Company.Employe employe = company.new Employe();
        employe.setNama("Hisyam Arief Zulfani");

        System.out.println(employe.getCompany());
        System.out.println(employe.getNmaa());
    }
}

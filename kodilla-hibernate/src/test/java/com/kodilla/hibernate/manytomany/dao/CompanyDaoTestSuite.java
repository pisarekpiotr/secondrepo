package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {

    @Autowired
    public CompanyDao companyDao;

    @Autowired
    public EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testCompanyAndEmployee(){

        //Given
        Employee jackSmith = new Employee("Jack", "Smith");
        Employee jeremyClarckson = new Employee("Jeremy", "Clarckson");
        Employee lindaBranighan = new Employee("Linda", "Branighan");

        Company volkswagenAktiengesellschaft  = new Company("Volkswagen Aktiengesellschaft");
        Company pSAGroup = new Company("PSA Group");
        Company fiatChryslerAutomobiles = new Company("Fiat Chrysler Automobiles");

        volkswagenAktiengesellschaft.getEmployees().add(jackSmith);
        pSAGroup.getEmployees().add(jeremyClarckson);
        volkswagenAktiengesellschaft.getEmployees().add(jeremyClarckson);
        fiatChryslerAutomobiles.getEmployees().add(lindaBranighan);
        fiatChryslerAutomobiles.getEmployees().add(jackSmith);

        jackSmith.getCompanies().add(volkswagenAktiengesellschaft);
        jackSmith.getCompanies().add(fiatChryslerAutomobiles);
        jeremyClarckson.getCompanies().add(volkswagenAktiengesellschaft);
        lindaBranighan.getCompanies().add(fiatChryslerAutomobiles);
        jeremyClarckson.getCompanies().add(pSAGroup);

        //When
        companyDao.save(volkswagenAktiengesellschaft);
        int volkswagenAktiengesellschaftId = volkswagenAktiengesellschaft.getId();
        companyDao.save(pSAGroup);
        int pSAGroupId = pSAGroup.getId();
        companyDao.save(fiatChryslerAutomobiles);
        int fiatChryslerAutomobilesId = fiatChryslerAutomobiles.getId();


        //Then
        List<Company> companyName = companyDao.retrieveByKeyValue("PSA");
        List<Employee> employeSurname = employeeDao.retrieveValueBySurname("Clarckson");


        //Then
      //  try {
            Assert.assertEquals(1, companyName.size());
            Assert.assertEquals(1, employeSurname.size());

      //  } finally {
            //CleanUp
      //     companyDao.deleteById(volkswagenAktiengesellschaftId);
     //      companyDao.deleteById(pSAGroupId);
     //      companyDao.deleteById(fiatChryslerAutomobilesId);
      //  }
    }
}
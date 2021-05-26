package com.main;

import com.dao.EmployeeDAO;
import com.to.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("beans.xml");

        EmployeeDAO dao = (EmployeeDAO) ap.getBean("edao");

        Employee e1 = new Employee();

        e1.setId(103);
        e1.setName("r");
        e1.setAge(30);

        int count = dao.addEmployee(e1);

        System.out.println(count + " records added");

    }
}

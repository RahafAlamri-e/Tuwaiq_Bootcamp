package week03.day01_Tasks;

public class Main {
    public static void main(String[] args) {

        // Account Objects
        Account acc1 = new Account();
        Account acc2 = new Account("A02", "Sara");
        Account acc3 = new Account("A03", "Omar", 3000);

        // acc1
        acc1.setId("A01");
        acc1.setName("Khalid");
        acc1.setBalance(5000);

        System.out.println("acc1 ID: " + acc1.getId());
        System.out.println("acc1 Name: " + acc1.getName());
        System.out.println("acc1 Balance: " + acc1.getBalance());

        System.out.println("acc1 after credit 1000: " + acc1.credit(1000));
        System.out.println("acc1 after debit 500: " + acc1.debit(500));
        System.out.println("acc1 after transfer 700 to acc2: " + acc1.transferTo(acc2, 700));
        System.out.println(acc1);
        System.out.println();

        // acc2
        acc2.setBalance(4000);

        System.out.println("acc2 ID: " + acc2.getId());
        System.out.println("acc2 Name: " + acc2.getName());
        System.out.println("acc2 Balance: " + acc2.getBalance());

        System.out.println("acc2 after credit 2000: " + acc2.credit(2000));
        System.out.println("acc2 after debit 1000: " + acc2.debit(1000));
        System.out.println("acc2 after transfer 500 to acc3: " + acc2.transferTo(acc3, 500));
        System.out.println(acc2);
        System.out.println();

        // acc3
        acc3.setId("A103");
        acc3.setName("Omar");
        acc3.setBalance(4000);

        System.out.println("acc3 ID: " + acc3.getId());
        System.out.println("acc3 Name: " + acc3.getName());
        System.out.println("acc3 Balance: " + acc3.getBalance());

        System.out.println("acc3 after credit 1500: " + acc3.credit(1500));
        System.out.println("acc3 after debit 700: " + acc3.debit(700));
        System.out.println("acc3 after transfer 600 to acc1: " + acc3.transferTo(acc1, 600));
        System.out.println(acc3);
        System.out.println();

        // final balances after transfers
        System.out.println("Final Account Objects:");
        System.out.println(acc1);
        System.out.println();
        System.out.println(acc2);
        System.out.println();
        System.out.println(acc3);
        System.out.println("---------------------------------");


        // Employee Objects
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("E02", "Lama", 6000);
        Employee emp3 = new Employee("E03", "Nora", 8000);

        // emp1
        emp1.setId("E01");
        emp1.setName("Ahmed");
        emp1.setSalary(5000);

        System.out.println("emp1 ID: " + emp1.getId());
        System.out.println("emp1 Name: " + emp1.getName());
        System.out.println("emp1 Salary: " + emp1.getSalary());
        System.out.println("emp1 Annual Salary: " + emp1.getAnnualSalary());
        System.out.println("emp1 after 10% raise: " + emp1.raisedSalary(10));
        System.out.println(emp1);
        System.out.println();

        // emp2
        emp2.setId("E102");
        emp2.setName("Lama");
        emp2.setSalary(6000);

        System.out.println("emp2 ID: " + emp2.getId());
        System.out.println("emp2 Name: " + emp2.getName());
        System.out.println("emp2 Salary: " + emp2.getSalary());
        System.out.println("emp2 Annual Salary: " + emp2.getAnnualSalary());
        System.out.println("emp2 after 15% raise: " + emp2.raisedSalary(15));
        System.out.println(emp2);
        System.out.println();

        // emp3
        emp3.setId("E103");
        emp3.setName("Nora");
        emp3.setSalary(8000);

        System.out.println("emp3 ID: " + emp3.getId());
        System.out.println("emp3 Name: " + emp3.getName());
        System.out.println("emp3 Salary: " + emp3.getSalary());
        System.out.println("emp3 Annual Salary: " + emp3.getAnnualSalary());
        System.out.println("emp3 after 20% raise: " + emp3.raisedSalary(20));
        System.out.println(emp3);
    }
}

package main.java.digital.ergo.interview.insurance;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class App {

    private static int MAX_PREMIUM = 10000000000;
    private static LocalDate date = LocalDateTime.now();

    private main ()
    {
        Contract contract = new Contract(date, MAX_PREMIUM, generatePeople());

        System.out.println(contract.contractType);
        System.out.println(contract.getPremium());
        System.out.println(contract.getStartDate());

        contract.getCustomers().forEach(c ->
                    {System.out.println(c.getCustomerId());
                    System.out.println(c.getType());
                    System.out.println(c.getDateOfBirth());
                    });

        System.out.println(contract.getCustomers().get(0).equals(new Person(LocalDate.of(2021,6,29), "policyHolder","0081683")));
    }

    private boolean generatePeople() {
    }
}

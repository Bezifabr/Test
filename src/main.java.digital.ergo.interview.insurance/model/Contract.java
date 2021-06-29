package main.java.digital.ergo.interview.insurance.model;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

public class Contract {

    public final String contractType = "Car Insurance";

    private LocalDate startDate;
    private BigInteger premium;
    private List<Person> customers;
}

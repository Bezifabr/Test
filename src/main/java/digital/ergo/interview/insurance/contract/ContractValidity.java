package digital.ergo.interview.insurance.contract;

import lombok.Data;

@Data
public class ContractValidity {

    private Boolean pastRefference;

    public void setChangeValid(Contract contract, String contractTerms) {
        //TO DO
    }
}

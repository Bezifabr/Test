package digital.ergo.interview.insurance.utils;

import digital.ergo.interview.insurance.contract.Contract;
import digital.ergo.interview.insurance.contract.ContractChangesHistory;
import digital.ergo.interview.insurance.contract.ContractValidity;

import java.util.Map;

public class ContractUtils {

    public boolean updateContractTerms (Contract contract, Map<Long, String> contractTerms) {
        int i = contract.getContractChangesHistory().size() - 1;
        ContractValidity validity = new ContractValidity();
        while (i < contract.getContractChangesHistory().size()) {
            ContractChangesHistory ostatniaZmiana = contract.getContractChangesHistory().get(i);
            if (ostatniaZmiana .getCategory() == 1 || ostatniaZmiana .getCategory() == 2) {
                validity.setChangeValid(contract, contractTerms.get(1L));
                if (ostatniaZmiana.getCoverage() != null && ostatniaZmiana.getAdditionalCoverage() != null && ostatniaZmiana.getReason() != null) {
                    validity.setPastRefference(true); contractTerms.put(10L, validity.getPastRefference().toString());
                    i++;
                }
            } else {
                if (ostatniaZmiana.getCoverage() != null && ostatniaZmiana.getAdditionalCoverage() != null && ostatniaZmiana.getReason() != null) {
                    validity.setChangeValid(contract, contractTerms.get(1L));
                    validity.setPastRefference(true); contractTerms.put(10L, validity.getPastRefference().toString());
                    i++;
                } else {
                    validity.setChangeValid(contract, contractTerms.get(1L));
                    i++; }
            }
        }
        return contract.amendTerms(contractTerms, validity);
    }
}

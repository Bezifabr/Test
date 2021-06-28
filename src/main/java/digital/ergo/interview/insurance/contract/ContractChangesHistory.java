package digital.ergo.interview.insurance.contract;

import lombok.Data;

@Data
public class ContractChangesHistory {

   private int category;
   private Object coverage;
   private Object additionalCoverage;
   private Object reason;
}

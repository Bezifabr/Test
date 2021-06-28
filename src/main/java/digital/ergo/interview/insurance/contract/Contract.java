package digital.ergo.interview.insurance.contract;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class Contract {

   private List<ContractChangesHistory> contractChangesHistory;

   public boolean amendTerms(Map<Long, String> contractTerms, ContractValidity validity) {
       return true;
   }
}

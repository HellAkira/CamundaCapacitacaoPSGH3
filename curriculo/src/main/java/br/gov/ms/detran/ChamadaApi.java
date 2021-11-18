package br.gov.ms.detran;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import java.util.Random;

public class ChamadaApi implements JavaDelegate{

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        Random r = new Random();
        int high = 10;
        int low = 0;
        int result = r.nextInt(high - low) + low;

        if(result <= 5){
            execution.setVariable("obs_avaliacao_antecedentes", "Gente boa");
        }else{
            execution.setVariable("obs_avaliacao_antecedentes", "Gente ma");

        }
    }
    
}

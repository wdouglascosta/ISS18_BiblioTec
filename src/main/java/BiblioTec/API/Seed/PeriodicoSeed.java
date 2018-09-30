package BiblioTec.API.Seed;

import BiblioTec.Domain.Enums.ItemStatus;
import BiblioTec.Domain.Periodico;
import BiblioTec.Service.PeriodicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class PeriodicoSeed implements AppSeed  {
    private static final Random random = new Random(1);
    @Autowired
    private PeriodicoService service;

    @Override
    public void loadSeed() throws IOException {
        if (service.hasData()) {
            System.out.println("Banco já possui dados");
            return;
        }

        Periodico periodico = new Periodico();
        List<Periodico> periodicos = VicAutoSeed.getInteligentInstances(periodico, 100);

        for (Periodico periodico1 : periodicos){
            if (periodico1.getStatus().equals(ItemStatus.INATIVADO)){
                periodico1.setMotivoInativacao(getmotivo());
            } else {
                periodico1.setMotivoInativacao("");
            }
            service.save(periodico1);
        }
    }
    private String getmotivo() {
        return MotivosInativacao.values()[random.nextInt(MotivosInativacao.values().length)].toString();
    }
}

package BiblioTec.API.Seed;

import BiblioTec.Domain.Academico;
import BiblioTec.Domain.Enums.ItemStatus;
import BiblioTec.Service.AcademicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.Random;

@Component
public class AcademicoSeed implements AppSeed {
    private static final Random random = new Random(1);
    @Autowired
    private AcademicoService service;
    @Override
    public void loadSeed() throws IOException {
        if (service.hasData()) {
            System.out.println("Banco já possui dados");
            return;
        }

        Academico academico = new Academico();
        List<Academico> academicos = VicAutoSeed.getInteligentInstances(academico, 100);

        for (Academico academico1 : academicos){
            if (academico1.getStatus().equals(ItemStatus.INATIVADO)){
                academico1.setMotivoInativacao(getmotivo());
            } else {
                academico1.setMotivoInativacao("");
            }
            service.save(academico1);
        }
    }
    private String getmotivo() {
        return MotivosInativacao.values()[random.nextInt(MotivosInativacao.values().length)].toString();
    }
}

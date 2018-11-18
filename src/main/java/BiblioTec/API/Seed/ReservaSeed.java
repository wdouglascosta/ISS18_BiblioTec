package BiblioTec.API.Seed;

import BiblioTec.Domain.Reserva;
import BiblioTec.Service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

public class ReservaSeed implements AppSeed {

    @Autowired
    private ReservaService reservaService;
    @Override
    public void loadSeed() throws IOException {

//        if (re)


    }
}

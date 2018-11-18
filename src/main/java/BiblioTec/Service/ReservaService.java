package BiblioTec.Service;

import BiblioTec.Domain.Reserva;
import BiblioTec.Repository.ReservaRepository;
import org.springframework.stereotype.Service;

@Service
public class ReservaService extends ServiceBase<Reserva, Long,ReservaRepository> {
    public ReservaService(ReservaRepository repository) {
        super(repository);
    }

    @Override
    public void delete(Long aLong) {
        repository.delete(aLong);
    }


}

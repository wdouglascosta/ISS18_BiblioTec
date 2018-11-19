package BiblioTec.API.Seed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

@Component
class Seed implements ApplicationListener<ContextRefreshedEvent> {

    private AtomicBoolean started = new AtomicBoolean(false);

    @Autowired
    private UsuarioSeed usuarioSeed;
    @Autowired
    private LivroSeed livroSeed;

    @Autowired
    private PeriodicoSeed periodicoSeed;
    @Autowired
    private AcademicoSeed academicoSeed;

    @Autowired
    private ReservaSeed reservaSeed;
    @Autowired
    private EmprestimoSeed emprestimoSeed;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        if (started.get()){
            return;
        }
        started.set(true);
        for (AppSeed seed : seeds()){
            try {
                seed.loadSeed();
            } catch (IOException e){
                throw new RuntimeException(e);
            }
        }
    }

    private List<AppSeed> seeds(){
        List<AppSeed> list = new LinkedList<>();
        list.add(usuarioSeed);
        list.add(livroSeed);
        list.add(periodicoSeed);
        list.add(academicoSeed);
        list.add(reservaSeed);
        list.add(emprestimoSeed);
        return list;
    }
}

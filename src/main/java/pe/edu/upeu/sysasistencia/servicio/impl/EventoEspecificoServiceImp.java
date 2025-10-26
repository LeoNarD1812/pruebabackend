package pe.edu.upeu.sysasistencia.servicio.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.sysasistencia.modelo.EventoEspecifico;
import pe.edu.upeu.sysasistencia.repositorio.ICrudGenericoRepository;
import pe.edu.upeu.sysasistencia.repositorio.IEventoEspecificoRepository;
import pe.edu.upeu.sysasistencia.servicio.IEventoEspecificoService;
import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class EventoEspecificoServiceImp extends CrudGenericoServiceImp<EventoEspecifico, Long>
        implements IEventoEspecificoService {

    private final IEventoEspecificoRepository repo;

    @Override
    protected ICrudGenericoRepository<EventoEspecifico, Long> getRepo() {
        return repo;
    }

    @Override
    public List<EventoEspecifico> findByEventoGeneral(Long eventoGeneralId) {
        return repo.findByEventoGeneralIdEventoGeneral(eventoGeneralId);
    }

    @Override
    public List<EventoEspecifico> findByFecha(LocalDate fecha) {
        return repo.findByFecha(fecha);
    }

    @Override
    public List<EventoEspecifico> findByEventoYRangoFechas(Long eventoId, LocalDate inicio, LocalDate fin) {
        return repo.findByEventoAndRangoFechas(eventoId, inicio, fin);
    }
}
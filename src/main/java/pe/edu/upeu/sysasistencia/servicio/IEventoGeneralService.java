package pe.edu.upeu.sysasistencia.servicio;

import pe.edu.upeu.sysasistencia.modelo.EventoGeneral;
import java.time.LocalDate;
import java.util.List;

public interface IEventoGeneralService extends ICrudGenericoService<EventoGeneral, Long> {
    List<EventoGeneral> findByPrograma(Long programaId);
    List<EventoGeneral> findEventosActivos(LocalDate fecha);
    List<EventoGeneral> findByCicloYPrograma(String ciclo, Long programaId);
}
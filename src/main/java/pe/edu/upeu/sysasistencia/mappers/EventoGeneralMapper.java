package pe.edu.upeu.sysasistencia.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import pe.edu.upeu.sysasistencia.dtos.EventoGeneralDTO;
import pe.edu.upeu.sysasistencia.modelo.EventoGeneral;

@Mapper(componentModel = "spring")
public interface EventoGeneralMapper extends GenericMapper<EventoGeneralDTO, EventoGeneral> {

    @Mapping(source = "programa.idPrograma", target = "programaId")
    @Mapping(source = "programa.nombre", target = "programaNombre")
    EventoGeneralDTO toDTO(EventoGeneral entity);

    @Mapping(source = "programaId", target = "programa.idPrograma")
    @Mapping(target = "programa.nombre", ignore = true)
    @Mapping(target = "programa.facultad", ignore = true)
    @Mapping(target = "programa.descripcion", ignore = true)
    EventoGeneral toEntity(EventoGeneralDTO dto);
}
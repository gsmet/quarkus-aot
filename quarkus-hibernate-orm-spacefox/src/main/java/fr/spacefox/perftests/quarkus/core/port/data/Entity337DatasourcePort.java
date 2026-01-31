package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service337.model.Model337;
import java.util.Optional;

public interface Entity337DatasourcePort {
    Optional<Model337> find(Long id);
}

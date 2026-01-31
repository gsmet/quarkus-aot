package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service325.model.Model325;
import java.util.Optional;

public interface Entity325DatasourcePort {
    Optional<Model325> find(Long id);
}

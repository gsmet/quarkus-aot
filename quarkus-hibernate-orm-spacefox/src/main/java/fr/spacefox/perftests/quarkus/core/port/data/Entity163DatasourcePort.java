package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service163.model.Model163;
import java.util.Optional;

public interface Entity163DatasourcePort {
    Optional<Model163> find(Long id);
}

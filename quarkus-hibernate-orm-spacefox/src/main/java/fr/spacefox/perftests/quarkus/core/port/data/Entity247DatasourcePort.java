package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service247.model.Model247;
import java.util.Optional;

public interface Entity247DatasourcePort {
    Optional<Model247> find(Long id);
}

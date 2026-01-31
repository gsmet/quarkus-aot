package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service34.model.Model34;
import java.util.Optional;

public interface Entity34DatasourcePort {
    Optional<Model34> find(Long id);
}

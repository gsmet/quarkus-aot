package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service172.model.Model172;
import java.util.Optional;

public interface Entity172DatasourcePort {
    Optional<Model172> find(Long id);
}

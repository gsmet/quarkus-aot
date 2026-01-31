package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service973.model.Model973;
import java.util.Optional;

public interface Entity973DatasourcePort {
    Optional<Model973> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service31.model.Model31;
import java.util.Optional;

public interface Entity31DatasourcePort {
    Optional<Model31> find(Long id);
}

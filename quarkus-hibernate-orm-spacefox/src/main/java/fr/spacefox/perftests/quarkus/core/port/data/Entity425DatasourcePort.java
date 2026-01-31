package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service425.model.Model425;
import java.util.Optional;

public interface Entity425DatasourcePort {
    Optional<Model425> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service988.model.Model988;
import java.util.Optional;

public interface Entity988DatasourcePort {
    Optional<Model988> find(Long id);
}

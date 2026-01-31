package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service933.model.Model933;
import java.util.Optional;

public interface Entity933DatasourcePort {
    Optional<Model933> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service619.model.Model619;
import java.util.Optional;

public interface Entity619DatasourcePort {
    Optional<Model619> find(Long id);
}

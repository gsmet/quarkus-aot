package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service809.model.Model809;
import java.util.Optional;

public interface Entity809DatasourcePort {
    Optional<Model809> find(Long id);
}

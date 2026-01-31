package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service919.model.Model919;
import java.util.Optional;

public interface Entity919DatasourcePort {
    Optional<Model919> find(Long id);
}

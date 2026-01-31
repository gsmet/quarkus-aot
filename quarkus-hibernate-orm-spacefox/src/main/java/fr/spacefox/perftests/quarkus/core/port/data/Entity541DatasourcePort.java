package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service541.model.Model541;
import java.util.Optional;

public interface Entity541DatasourcePort {
    Optional<Model541> find(Long id);
}

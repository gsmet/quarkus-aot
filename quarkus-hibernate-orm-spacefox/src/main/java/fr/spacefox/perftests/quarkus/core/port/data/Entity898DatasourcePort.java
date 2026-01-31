package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service898.model.Model898;
import java.util.Optional;

public interface Entity898DatasourcePort {
    Optional<Model898> find(Long id);
}

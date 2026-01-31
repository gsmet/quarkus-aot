package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service469.model.Model469;
import java.util.Optional;

public interface Entity469DatasourcePort {
    Optional<Model469> find(Long id);
}

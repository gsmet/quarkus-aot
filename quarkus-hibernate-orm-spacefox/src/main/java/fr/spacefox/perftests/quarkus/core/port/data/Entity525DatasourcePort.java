package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service525.model.Model525;
import java.util.Optional;

public interface Entity525DatasourcePort {
    Optional<Model525> find(Long id);
}

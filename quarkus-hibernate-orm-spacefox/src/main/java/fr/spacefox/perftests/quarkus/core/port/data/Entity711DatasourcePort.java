package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service711.model.Model711;
import java.util.Optional;

public interface Entity711DatasourcePort {
    Optional<Model711> find(Long id);
}

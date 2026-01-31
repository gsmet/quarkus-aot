package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service266.model.Model266;
import java.util.Optional;

public interface Entity266DatasourcePort {
    Optional<Model266> find(Long id);
}

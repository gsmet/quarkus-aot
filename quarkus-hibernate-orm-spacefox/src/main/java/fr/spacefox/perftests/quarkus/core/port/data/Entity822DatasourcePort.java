package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service822.model.Model822;
import java.util.Optional;

public interface Entity822DatasourcePort {
    Optional<Model822> find(Long id);
}

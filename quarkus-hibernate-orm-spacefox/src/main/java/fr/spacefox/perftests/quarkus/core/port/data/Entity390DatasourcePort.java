package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service390.model.Model390;
import java.util.Optional;

public interface Entity390DatasourcePort {
    Optional<Model390> find(Long id);
}

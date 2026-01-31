package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service732.model.Model732;
import java.util.Optional;

public interface Entity732DatasourcePort {
    Optional<Model732> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service30.model.Model30;
import java.util.Optional;

public interface Entity30DatasourcePort {
    Optional<Model30> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service75.model.Model75;
import java.util.Optional;

public interface Entity75DatasourcePort {
    Optional<Model75> find(Long id);
}

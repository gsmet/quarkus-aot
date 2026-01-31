package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service155.model.Model155;
import java.util.Optional;

public interface Entity155DatasourcePort {
    Optional<Model155> find(Long id);
}

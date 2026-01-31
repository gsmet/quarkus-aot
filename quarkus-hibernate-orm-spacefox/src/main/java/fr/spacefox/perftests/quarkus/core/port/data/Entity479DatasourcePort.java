package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service479.model.Model479;
import java.util.Optional;

public interface Entity479DatasourcePort {
    Optional<Model479> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service283.model.Model283;
import java.util.Optional;

public interface Entity283DatasourcePort {
    Optional<Model283> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service146.model.Model146;
import java.util.Optional;

public interface Entity146DatasourcePort {
    Optional<Model146> find(Long id);
}

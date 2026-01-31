package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service147.model.Model147;
import java.util.Optional;

public interface Entity147DatasourcePort {
    Optional<Model147> find(Long id);
}

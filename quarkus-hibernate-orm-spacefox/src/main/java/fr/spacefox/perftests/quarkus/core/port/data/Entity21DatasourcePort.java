package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service21.model.Model21;
import java.util.Optional;

public interface Entity21DatasourcePort {
    Optional<Model21> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service235.model.Model235;
import java.util.Optional;

public interface Entity235DatasourcePort {
    Optional<Model235> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service937.model.Model937;
import java.util.Optional;

public interface Entity937DatasourcePort {
    Optional<Model937> find(Long id);
}

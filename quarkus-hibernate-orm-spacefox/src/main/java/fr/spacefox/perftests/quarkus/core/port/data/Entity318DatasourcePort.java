package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service318.model.Model318;
import java.util.Optional;

public interface Entity318DatasourcePort {
    Optional<Model318> find(Long id);
}

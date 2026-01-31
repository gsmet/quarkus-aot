package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service517.model.Model517;
import java.util.Optional;

public interface Entity517DatasourcePort {
    Optional<Model517> find(Long id);
}

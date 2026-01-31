package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service224.model.Model224;
import java.util.Optional;

public interface Entity224DatasourcePort {
    Optional<Model224> find(Long id);
}

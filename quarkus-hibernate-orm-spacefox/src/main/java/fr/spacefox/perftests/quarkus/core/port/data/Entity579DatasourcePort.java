package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service579.model.Model579;
import java.util.Optional;

public interface Entity579DatasourcePort {
    Optional<Model579> find(Long id);
}

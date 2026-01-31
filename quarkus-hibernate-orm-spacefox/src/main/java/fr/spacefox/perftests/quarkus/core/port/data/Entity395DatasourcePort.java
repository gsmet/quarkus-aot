package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service395.model.Model395;
import java.util.Optional;

public interface Entity395DatasourcePort {
    Optional<Model395> find(Long id);
}

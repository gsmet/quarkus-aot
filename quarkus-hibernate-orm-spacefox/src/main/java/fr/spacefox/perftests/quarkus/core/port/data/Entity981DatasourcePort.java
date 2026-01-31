package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service981.model.Model981;
import java.util.Optional;

public interface Entity981DatasourcePort {
    Optional<Model981> find(Long id);
}

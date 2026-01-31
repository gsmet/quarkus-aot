package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service669.model.Model669;
import java.util.Optional;

public interface Entity669DatasourcePort {
    Optional<Model669> find(Long id);
}

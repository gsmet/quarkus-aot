package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service482.model.Model482;
import java.util.Optional;

public interface Entity482DatasourcePort {
    Optional<Model482> find(Long id);
}

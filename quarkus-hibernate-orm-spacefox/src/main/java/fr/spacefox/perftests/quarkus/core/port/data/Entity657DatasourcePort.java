package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service657.model.Model657;
import java.util.Optional;

public interface Entity657DatasourcePort {
    Optional<Model657> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service366.model.Model366;
import java.util.Optional;

public interface Entity366DatasourcePort {
    Optional<Model366> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service192.model.Model192;
import java.util.Optional;

public interface Entity192DatasourcePort {
    Optional<Model192> find(Long id);
}

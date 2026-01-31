package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service225.model.Model225;
import java.util.Optional;

public interface Entity225DatasourcePort {
    Optional<Model225> find(Long id);
}

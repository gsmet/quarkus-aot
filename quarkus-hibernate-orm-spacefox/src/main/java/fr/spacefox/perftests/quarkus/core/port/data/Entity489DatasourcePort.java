package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service489.model.Model489;
import java.util.Optional;

public interface Entity489DatasourcePort {
    Optional<Model489> find(Long id);
}

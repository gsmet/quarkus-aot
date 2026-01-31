package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service254.model.Model254;
import java.util.Optional;

public interface Entity254DatasourcePort {
    Optional<Model254> find(Long id);
}

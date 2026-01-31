package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service521.model.Model521;
import java.util.Optional;

public interface Entity521DatasourcePort {
    Optional<Model521> find(Long id);
}

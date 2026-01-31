package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service546.model.Model546;
import java.util.Optional;

public interface Entity546DatasourcePort {
    Optional<Model546> find(Long id);
}

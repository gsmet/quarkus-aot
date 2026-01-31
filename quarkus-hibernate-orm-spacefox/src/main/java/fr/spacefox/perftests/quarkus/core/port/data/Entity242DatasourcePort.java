package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service242.model.Model242;
import java.util.Optional;

public interface Entity242DatasourcePort {
    Optional<Model242> find(Long id);
}

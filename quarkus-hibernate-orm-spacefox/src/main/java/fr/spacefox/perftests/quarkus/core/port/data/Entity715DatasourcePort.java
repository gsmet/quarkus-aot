package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service715.model.Model715;
import java.util.Optional;

public interface Entity715DatasourcePort {
    Optional<Model715> find(Long id);
}

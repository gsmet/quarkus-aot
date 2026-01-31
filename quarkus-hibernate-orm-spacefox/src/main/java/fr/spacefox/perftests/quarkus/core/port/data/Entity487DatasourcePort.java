package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service487.model.Model487;
import java.util.Optional;

public interface Entity487DatasourcePort {
    Optional<Model487> find(Long id);
}

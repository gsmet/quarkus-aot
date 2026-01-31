package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service81.model.Model81;
import java.util.Optional;

public interface Entity81DatasourcePort {
    Optional<Model81> find(Long id);
}

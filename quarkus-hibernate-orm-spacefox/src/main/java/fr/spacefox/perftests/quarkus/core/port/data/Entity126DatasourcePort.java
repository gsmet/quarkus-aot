package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service126.model.Model126;
import java.util.Optional;

public interface Entity126DatasourcePort {
    Optional<Model126> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service966.model.Model966;
import java.util.Optional;

public interface Entity966DatasourcePort {
    Optional<Model966> find(Long id);
}

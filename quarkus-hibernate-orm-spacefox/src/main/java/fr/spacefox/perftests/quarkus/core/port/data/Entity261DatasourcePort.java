package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service261.model.Model261;
import java.util.Optional;

public interface Entity261DatasourcePort {
    Optional<Model261> find(Long id);
}

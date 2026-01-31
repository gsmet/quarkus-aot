package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service660.model.Model660;
import java.util.Optional;

public interface Entity660DatasourcePort {
    Optional<Model660> find(Long id);
}

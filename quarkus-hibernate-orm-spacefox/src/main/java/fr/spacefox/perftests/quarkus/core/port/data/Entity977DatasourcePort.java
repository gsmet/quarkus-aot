package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service977.model.Model977;
import java.util.Optional;

public interface Entity977DatasourcePort {
    Optional<Model977> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service733.model.Model733;
import java.util.Optional;

public interface Entity733DatasourcePort {
    Optional<Model733> find(Long id);
}

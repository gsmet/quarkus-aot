package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service679.model.Model679;
import java.util.Optional;

public interface Entity679DatasourcePort {
    Optional<Model679> find(Long id);
}

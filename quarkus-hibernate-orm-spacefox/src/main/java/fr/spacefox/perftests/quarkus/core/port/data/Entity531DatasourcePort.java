package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service531.model.Model531;
import java.util.Optional;

public interface Entity531DatasourcePort {
    Optional<Model531> find(Long id);
}

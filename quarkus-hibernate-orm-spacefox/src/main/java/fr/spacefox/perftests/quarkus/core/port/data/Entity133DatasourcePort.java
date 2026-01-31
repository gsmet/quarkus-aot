package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service133.model.Model133;
import java.util.Optional;

public interface Entity133DatasourcePort {
    Optional<Model133> find(Long id);
}

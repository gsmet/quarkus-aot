package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service915.model.Model915;
import java.util.Optional;

public interface Entity915DatasourcePort {
    Optional<Model915> find(Long id);
}

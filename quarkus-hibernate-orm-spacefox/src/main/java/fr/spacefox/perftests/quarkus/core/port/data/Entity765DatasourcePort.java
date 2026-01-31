package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service765.model.Model765;
import java.util.Optional;

public interface Entity765DatasourcePort {
    Optional<Model765> find(Long id);
}

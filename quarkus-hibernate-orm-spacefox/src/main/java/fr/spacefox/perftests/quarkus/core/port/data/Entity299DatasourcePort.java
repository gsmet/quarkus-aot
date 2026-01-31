package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service299.model.Model299;
import java.util.Optional;

public interface Entity299DatasourcePort {
    Optional<Model299> find(Long id);
}

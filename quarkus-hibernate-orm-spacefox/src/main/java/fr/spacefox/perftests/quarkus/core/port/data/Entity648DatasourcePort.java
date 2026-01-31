package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service648.model.Model648;
import java.util.Optional;

public interface Entity648DatasourcePort {
    Optional<Model648> find(Long id);
}

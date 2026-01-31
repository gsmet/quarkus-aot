package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service445.model.Model445;
import java.util.Optional;

public interface Entity445DatasourcePort {
    Optional<Model445> find(Long id);
}

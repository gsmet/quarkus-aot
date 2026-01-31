package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service127.model.Model127;
import java.util.Optional;

public interface Entity127DatasourcePort {
    Optional<Model127> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service80.model.Model80;
import java.util.Optional;

public interface Entity80DatasourcePort {
    Optional<Model80> find(Long id);
}

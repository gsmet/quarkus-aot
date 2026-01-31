package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service759.model.Model759;
import java.util.Optional;

public interface Entity759DatasourcePort {
    Optional<Model759> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service28.model.Model28;
import java.util.Optional;

public interface Entity28DatasourcePort {
    Optional<Model28> find(Long id);
}

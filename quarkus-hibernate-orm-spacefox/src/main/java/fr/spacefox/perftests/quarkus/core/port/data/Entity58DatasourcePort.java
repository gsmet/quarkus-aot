package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service58.model.Model58;
import java.util.Optional;

public interface Entity58DatasourcePort {
    Optional<Model58> find(Long id);
}

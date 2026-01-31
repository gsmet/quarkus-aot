package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service377.model.Model377;
import java.util.Optional;

public interface Entity377DatasourcePort {
    Optional<Model377> find(Long id);
}

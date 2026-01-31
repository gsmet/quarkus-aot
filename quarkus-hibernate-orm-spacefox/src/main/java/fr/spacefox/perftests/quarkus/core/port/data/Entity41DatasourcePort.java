package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service41.model.Model41;
import java.util.Optional;

public interface Entity41DatasourcePort {
    Optional<Model41> find(Long id);
}

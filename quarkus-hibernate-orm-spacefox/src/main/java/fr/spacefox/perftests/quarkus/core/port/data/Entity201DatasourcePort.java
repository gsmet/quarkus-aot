package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service201.model.Model201;
import java.util.Optional;

public interface Entity201DatasourcePort {
    Optional<Model201> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service821.model.Model821;
import java.util.Optional;

public interface Entity821DatasourcePort {
    Optional<Model821> find(Long id);
}

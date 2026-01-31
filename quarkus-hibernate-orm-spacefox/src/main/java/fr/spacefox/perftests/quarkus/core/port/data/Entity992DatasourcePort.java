package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service992.model.Model992;
import java.util.Optional;

public interface Entity992DatasourcePort {
    Optional<Model992> find(Long id);
}

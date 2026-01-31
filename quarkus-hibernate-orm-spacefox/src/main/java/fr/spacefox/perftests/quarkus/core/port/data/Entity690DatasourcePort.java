package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service690.model.Model690;
import java.util.Optional;

public interface Entity690DatasourcePort {
    Optional<Model690> find(Long id);
}

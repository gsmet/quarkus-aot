package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service140.model.Model140;
import java.util.Optional;

public interface Entity140DatasourcePort {
    Optional<Model140> find(Long id);
}

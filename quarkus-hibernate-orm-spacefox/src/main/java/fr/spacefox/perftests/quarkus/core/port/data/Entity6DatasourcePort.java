package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service6.model.Model6;
import java.util.Optional;

public interface Entity6DatasourcePort {
    Optional<Model6> find(Long id);
}

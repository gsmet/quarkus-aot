package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service210.model.Model210;
import java.util.Optional;

public interface Entity210DatasourcePort {
    Optional<Model210> find(Long id);
}

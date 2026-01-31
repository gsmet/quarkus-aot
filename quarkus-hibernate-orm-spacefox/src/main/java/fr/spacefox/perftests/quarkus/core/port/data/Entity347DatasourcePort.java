package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service347.model.Model347;
import java.util.Optional;

public interface Entity347DatasourcePort {
    Optional<Model347> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service841.model.Model841;
import java.util.Optional;

public interface Entity841DatasourcePort {
    Optional<Model841> find(Long id);
}

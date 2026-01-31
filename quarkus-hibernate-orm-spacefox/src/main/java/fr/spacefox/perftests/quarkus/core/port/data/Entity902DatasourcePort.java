package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service902.model.Model902;
import java.util.Optional;

public interface Entity902DatasourcePort {
    Optional<Model902> find(Long id);
}

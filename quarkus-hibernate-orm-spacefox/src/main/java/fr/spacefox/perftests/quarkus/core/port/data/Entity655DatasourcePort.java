package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service655.model.Model655;
import java.util.Optional;

public interface Entity655DatasourcePort {
    Optional<Model655> find(Long id);
}

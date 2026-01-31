package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service768.model.Model768;
import java.util.Optional;

public interface Entity768DatasourcePort {
    Optional<Model768> find(Long id);
}

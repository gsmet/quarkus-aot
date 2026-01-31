package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service848.model.Model848;
import java.util.Optional;

public interface Entity848DatasourcePort {
    Optional<Model848> find(Long id);
}

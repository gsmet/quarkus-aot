package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service681.model.Model681;
import java.util.Optional;

public interface Entity681DatasourcePort {
    Optional<Model681> find(Long id);
}

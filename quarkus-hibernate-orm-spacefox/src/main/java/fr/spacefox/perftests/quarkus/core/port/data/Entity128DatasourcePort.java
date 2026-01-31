package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service128.model.Model128;
import java.util.Optional;

public interface Entity128DatasourcePort {
    Optional<Model128> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service7.model.Model7;
import java.util.Optional;

public interface Entity7DatasourcePort {
    Optional<Model7> find(Long id);
}

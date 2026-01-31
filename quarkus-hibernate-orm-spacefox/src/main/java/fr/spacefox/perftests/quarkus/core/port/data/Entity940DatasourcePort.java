package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service940.model.Model940;
import java.util.Optional;

public interface Entity940DatasourcePort {
    Optional<Model940> find(Long id);
}

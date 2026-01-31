package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service131.model.Model131;
import java.util.Optional;

public interface Entity131DatasourcePort {
    Optional<Model131> find(Long id);
}

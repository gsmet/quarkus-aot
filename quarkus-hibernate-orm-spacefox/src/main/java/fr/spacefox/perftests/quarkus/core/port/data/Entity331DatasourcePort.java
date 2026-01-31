package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service331.model.Model331;
import java.util.Optional;

public interface Entity331DatasourcePort {
    Optional<Model331> find(Long id);
}

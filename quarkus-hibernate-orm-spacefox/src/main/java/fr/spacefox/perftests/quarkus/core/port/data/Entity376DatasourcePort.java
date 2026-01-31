package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service376.model.Model376;
import java.util.Optional;

public interface Entity376DatasourcePort {
    Optional<Model376> find(Long id);
}

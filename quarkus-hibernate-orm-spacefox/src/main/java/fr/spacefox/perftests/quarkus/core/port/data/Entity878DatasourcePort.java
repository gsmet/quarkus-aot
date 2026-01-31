package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service878.model.Model878;
import java.util.Optional;

public interface Entity878DatasourcePort {
    Optional<Model878> find(Long id);
}

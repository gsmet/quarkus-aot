package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service861.model.Model861;
import java.util.Optional;

public interface Entity861DatasourcePort {
    Optional<Model861> find(Long id);
}

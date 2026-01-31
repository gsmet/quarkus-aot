package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service451.model.Model451;
import java.util.Optional;

public interface Entity451DatasourcePort {
    Optional<Model451> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service592.model.Model592;
import java.util.Optional;

public interface Entity592DatasourcePort {
    Optional<Model592> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service854.model.Model854;
import java.util.Optional;

public interface Entity854DatasourcePort {
    Optional<Model854> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service560.model.Model560;
import java.util.Optional;

public interface Entity560DatasourcePort {
    Optional<Model560> find(Long id);
}

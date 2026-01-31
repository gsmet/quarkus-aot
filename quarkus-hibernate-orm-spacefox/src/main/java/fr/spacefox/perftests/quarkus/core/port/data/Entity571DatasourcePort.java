package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service571.model.Model571;
import java.util.Optional;

public interface Entity571DatasourcePort {
    Optional<Model571> find(Long id);
}

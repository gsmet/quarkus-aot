package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service102.model.Model102;
import java.util.Optional;

public interface Entity102DatasourcePort {
    Optional<Model102> find(Long id);
}

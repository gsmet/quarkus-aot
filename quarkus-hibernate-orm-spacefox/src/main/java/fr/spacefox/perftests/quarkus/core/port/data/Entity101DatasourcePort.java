package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service101.model.Model101;
import java.util.Optional;

public interface Entity101DatasourcePort {
    Optional<Model101> find(Long id);
}

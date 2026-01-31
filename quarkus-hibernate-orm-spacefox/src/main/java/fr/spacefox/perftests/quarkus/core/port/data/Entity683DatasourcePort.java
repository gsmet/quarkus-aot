package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service683.model.Model683;
import java.util.Optional;

public interface Entity683DatasourcePort {
    Optional<Model683> find(Long id);
}

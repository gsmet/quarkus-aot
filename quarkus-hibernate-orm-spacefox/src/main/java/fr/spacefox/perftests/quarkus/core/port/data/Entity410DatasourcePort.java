package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service410.model.Model410;
import java.util.Optional;

public interface Entity410DatasourcePort {
    Optional<Model410> find(Long id);
}

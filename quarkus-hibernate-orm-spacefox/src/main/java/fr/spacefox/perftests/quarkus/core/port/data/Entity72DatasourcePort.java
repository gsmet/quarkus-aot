package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service72.model.Model72;
import java.util.Optional;

public interface Entity72DatasourcePort {
    Optional<Model72> find(Long id);
}

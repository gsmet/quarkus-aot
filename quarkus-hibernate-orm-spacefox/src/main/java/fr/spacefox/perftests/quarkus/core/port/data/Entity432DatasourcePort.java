package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service432.model.Model432;
import java.util.Optional;

public interface Entity432DatasourcePort {
    Optional<Model432> find(Long id);
}

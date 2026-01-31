package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service792.model.Model792;
import java.util.Optional;

public interface Entity792DatasourcePort {
    Optional<Model792> find(Long id);
}

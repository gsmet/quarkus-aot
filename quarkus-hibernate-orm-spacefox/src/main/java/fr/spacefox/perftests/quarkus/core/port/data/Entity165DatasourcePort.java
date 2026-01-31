package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service165.model.Model165;
import java.util.Optional;

public interface Entity165DatasourcePort {
    Optional<Model165> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service493.model.Model493;
import java.util.Optional;

public interface Entity493DatasourcePort {
    Optional<Model493> find(Long id);
}

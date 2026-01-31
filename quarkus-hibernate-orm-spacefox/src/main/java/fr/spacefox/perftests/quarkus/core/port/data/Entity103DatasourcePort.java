package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service103.model.Model103;
import java.util.Optional;

public interface Entity103DatasourcePort {
    Optional<Model103> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service671.model.Model671;
import java.util.Optional;

public interface Entity671DatasourcePort {
    Optional<Model671> find(Long id);
}

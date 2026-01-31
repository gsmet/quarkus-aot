package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service374.model.Model374;
import java.util.Optional;

public interface Entity374DatasourcePort {
    Optional<Model374> find(Long id);
}

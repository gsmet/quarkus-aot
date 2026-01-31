package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service534.model.Model534;
import java.util.Optional;

public interface Entity534DatasourcePort {
    Optional<Model534> find(Long id);
}

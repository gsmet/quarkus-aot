package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service278.model.Model278;
import java.util.Optional;

public interface Entity278DatasourcePort {
    Optional<Model278> find(Long id);
}

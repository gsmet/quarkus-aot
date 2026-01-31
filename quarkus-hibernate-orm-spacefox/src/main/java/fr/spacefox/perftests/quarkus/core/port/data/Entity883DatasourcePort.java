package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service883.model.Model883;
import java.util.Optional;

public interface Entity883DatasourcePort {
    Optional<Model883> find(Long id);
}

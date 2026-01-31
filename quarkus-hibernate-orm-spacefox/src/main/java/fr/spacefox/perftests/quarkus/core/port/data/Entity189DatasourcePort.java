package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service189.model.Model189;
import java.util.Optional;

public interface Entity189DatasourcePort {
    Optional<Model189> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service271.model.Model271;
import java.util.Optional;

public interface Entity271DatasourcePort {
    Optional<Model271> find(Long id);
}

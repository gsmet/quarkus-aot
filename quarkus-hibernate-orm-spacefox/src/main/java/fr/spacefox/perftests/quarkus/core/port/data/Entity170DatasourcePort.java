package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service170.model.Model170;
import java.util.Optional;

public interface Entity170DatasourcePort {
    Optional<Model170> find(Long id);
}

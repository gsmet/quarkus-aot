package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service682.model.Model682;
import java.util.Optional;

public interface Entity682DatasourcePort {
    Optional<Model682> find(Long id);
}

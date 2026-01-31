package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service676.model.Model676;
import java.util.Optional;

public interface Entity676DatasourcePort {
    Optional<Model676> find(Long id);
}

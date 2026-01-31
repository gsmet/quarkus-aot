package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service542.model.Model542;
import java.util.Optional;

public interface Entity542DatasourcePort {
    Optional<Model542> find(Long id);
}

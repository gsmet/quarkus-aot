package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service835.model.Model835;
import java.util.Optional;

public interface Entity835DatasourcePort {
    Optional<Model835> find(Long id);
}

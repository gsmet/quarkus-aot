package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service446.model.Model446;
import java.util.Optional;

public interface Entity446DatasourcePort {
    Optional<Model446> find(Long id);
}

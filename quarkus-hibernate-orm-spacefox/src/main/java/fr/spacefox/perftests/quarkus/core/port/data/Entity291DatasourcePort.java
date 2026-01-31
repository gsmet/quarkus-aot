package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service291.model.Model291;
import java.util.Optional;

public interface Entity291DatasourcePort {
    Optional<Model291> find(Long id);
}

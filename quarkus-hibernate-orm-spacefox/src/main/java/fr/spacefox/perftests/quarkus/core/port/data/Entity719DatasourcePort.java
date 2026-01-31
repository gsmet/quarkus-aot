package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service719.model.Model719;
import java.util.Optional;

public interface Entity719DatasourcePort {
    Optional<Model719> find(Long id);
}

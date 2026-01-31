package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service249.model.Model249;
import java.util.Optional;

public interface Entity249DatasourcePort {
    Optional<Model249> find(Long id);
}

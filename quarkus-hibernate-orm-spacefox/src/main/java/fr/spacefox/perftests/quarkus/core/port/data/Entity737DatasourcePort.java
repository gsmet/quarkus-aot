package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service737.model.Model737;
import java.util.Optional;

public interface Entity737DatasourcePort {
    Optional<Model737> find(Long id);
}

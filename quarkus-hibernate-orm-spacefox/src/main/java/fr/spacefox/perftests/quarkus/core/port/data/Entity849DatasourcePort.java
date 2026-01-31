package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service849.model.Model849;
import java.util.Optional;

public interface Entity849DatasourcePort {
    Optional<Model849> find(Long id);
}

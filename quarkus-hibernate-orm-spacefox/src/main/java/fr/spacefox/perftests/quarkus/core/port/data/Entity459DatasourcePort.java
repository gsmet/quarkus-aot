package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service459.model.Model459;
import java.util.Optional;

public interface Entity459DatasourcePort {
    Optional<Model459> find(Long id);
}

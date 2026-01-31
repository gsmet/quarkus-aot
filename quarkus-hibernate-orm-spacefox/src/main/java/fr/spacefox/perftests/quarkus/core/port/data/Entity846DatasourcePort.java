package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service846.model.Model846;
import java.util.Optional;

public interface Entity846DatasourcePort {
    Optional<Model846> find(Long id);
}

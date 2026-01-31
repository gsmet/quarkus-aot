package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service583.model.Model583;
import java.util.Optional;

public interface Entity583DatasourcePort {
    Optional<Model583> find(Long id);
}

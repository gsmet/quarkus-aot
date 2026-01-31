package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service627.model.Model627;
import java.util.Optional;

public interface Entity627DatasourcePort {
    Optional<Model627> find(Long id);
}

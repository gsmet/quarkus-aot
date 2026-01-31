package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service179.model.Model179;
import java.util.Optional;

public interface Entity179DatasourcePort {
    Optional<Model179> find(Long id);
}

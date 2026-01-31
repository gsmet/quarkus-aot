package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service312.model.Model312;
import java.util.Optional;

public interface Entity312DatasourcePort {
    Optional<Model312> find(Long id);
}

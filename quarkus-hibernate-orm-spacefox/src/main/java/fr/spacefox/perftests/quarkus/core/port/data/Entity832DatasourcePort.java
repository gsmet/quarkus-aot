package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service832.model.Model832;
import java.util.Optional;

public interface Entity832DatasourcePort {
    Optional<Model832> find(Long id);
}

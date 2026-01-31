package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service78.model.Model78;
import java.util.Optional;

public interface Entity78DatasourcePort {
    Optional<Model78> find(Long id);
}

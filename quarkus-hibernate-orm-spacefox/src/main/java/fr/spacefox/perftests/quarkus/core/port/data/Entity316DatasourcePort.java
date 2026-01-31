package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service316.model.Model316;
import java.util.Optional;

public interface Entity316DatasourcePort {
    Optional<Model316> find(Long id);
}

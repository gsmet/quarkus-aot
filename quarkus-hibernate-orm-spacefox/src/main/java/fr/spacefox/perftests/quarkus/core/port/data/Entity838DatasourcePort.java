package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service838.model.Model838;
import java.util.Optional;

public interface Entity838DatasourcePort {
    Optional<Model838> find(Long id);
}

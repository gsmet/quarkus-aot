package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service463.model.Model463;
import java.util.Optional;

public interface Entity463DatasourcePort {
    Optional<Model463> find(Long id);
}

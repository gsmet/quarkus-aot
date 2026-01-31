package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service239.model.Model239;
import java.util.Optional;

public interface Entity239DatasourcePort {
    Optional<Model239> find(Long id);
}

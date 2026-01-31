package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service623.model.Model623;
import java.util.Optional;

public interface Entity623DatasourcePort {
    Optional<Model623> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service227.model.Model227;
import java.util.Optional;

public interface Entity227DatasourcePort {
    Optional<Model227> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service728.model.Model728;
import java.util.Optional;

public interface Entity728DatasourcePort {
    Optional<Model728> find(Long id);
}

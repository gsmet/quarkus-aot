package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service842.model.Model842;
import java.util.Optional;

public interface Entity842DatasourcePort {
    Optional<Model842> find(Long id);
}

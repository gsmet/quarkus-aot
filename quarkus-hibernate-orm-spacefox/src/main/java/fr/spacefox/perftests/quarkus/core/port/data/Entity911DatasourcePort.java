package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service911.model.Model911;
import java.util.Optional;

public interface Entity911DatasourcePort {
    Optional<Model911> find(Long id);
}

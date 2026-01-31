package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service613.model.Model613;
import java.util.Optional;

public interface Entity613DatasourcePort {
    Optional<Model613> find(Long id);
}

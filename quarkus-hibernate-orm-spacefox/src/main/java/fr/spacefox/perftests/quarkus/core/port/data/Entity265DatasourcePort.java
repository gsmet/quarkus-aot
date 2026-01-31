package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service265.model.Model265;
import java.util.Optional;

public interface Entity265DatasourcePort {
    Optional<Model265> find(Long id);
}

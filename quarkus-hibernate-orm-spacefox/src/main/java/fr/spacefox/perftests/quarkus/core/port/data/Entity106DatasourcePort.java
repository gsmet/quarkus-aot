package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service106.model.Model106;
import java.util.Optional;

public interface Entity106DatasourcePort {
    Optional<Model106> find(Long id);
}

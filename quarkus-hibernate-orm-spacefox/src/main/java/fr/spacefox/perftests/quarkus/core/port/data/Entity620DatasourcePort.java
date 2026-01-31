package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service620.model.Model620;
import java.util.Optional;

public interface Entity620DatasourcePort {
    Optional<Model620> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service785.model.Model785;
import java.util.Optional;

public interface Entity785DatasourcePort {
    Optional<Model785> find(Long id);
}

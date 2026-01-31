package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service510.model.Model510;
import java.util.Optional;

public interface Entity510DatasourcePort {
    Optional<Model510> find(Long id);
}

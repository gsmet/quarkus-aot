package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service766.model.Model766;
import java.util.Optional;

public interface Entity766DatasourcePort {
    Optional<Model766> find(Long id);
}

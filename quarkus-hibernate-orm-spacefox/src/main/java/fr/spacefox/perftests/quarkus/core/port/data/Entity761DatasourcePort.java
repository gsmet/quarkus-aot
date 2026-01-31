package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service761.model.Model761;
import java.util.Optional;

public interface Entity761DatasourcePort {
    Optional<Model761> find(Long id);
}

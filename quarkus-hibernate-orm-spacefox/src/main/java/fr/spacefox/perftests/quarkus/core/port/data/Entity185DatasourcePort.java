package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service185.model.Model185;
import java.util.Optional;

public interface Entity185DatasourcePort {
    Optional<Model185> find(Long id);
}

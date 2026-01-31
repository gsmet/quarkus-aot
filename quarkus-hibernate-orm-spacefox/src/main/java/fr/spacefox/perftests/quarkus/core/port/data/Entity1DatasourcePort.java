package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service1.model.Model1;
import java.util.Optional;

public interface Entity1DatasourcePort {
    Optional<Model1> find(Long id);
}

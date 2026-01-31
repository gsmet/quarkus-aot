package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service703.model.Model703;
import java.util.Optional;

public interface Entity703DatasourcePort {
    Optional<Model703> find(Long id);
}

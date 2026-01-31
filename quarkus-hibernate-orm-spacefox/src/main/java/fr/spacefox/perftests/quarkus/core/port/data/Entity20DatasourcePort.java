package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service20.model.Model20;
import java.util.Optional;

public interface Entity20DatasourcePort {
    Optional<Model20> find(Long id);
}

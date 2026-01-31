package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service876.model.Model876;
import java.util.Optional;

public interface Entity876DatasourcePort {
    Optional<Model876> find(Long id);
}

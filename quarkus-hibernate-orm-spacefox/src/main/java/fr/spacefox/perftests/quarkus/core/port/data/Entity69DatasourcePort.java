package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service69.model.Model69;
import java.util.Optional;

public interface Entity69DatasourcePort {
    Optional<Model69> find(Long id);
}

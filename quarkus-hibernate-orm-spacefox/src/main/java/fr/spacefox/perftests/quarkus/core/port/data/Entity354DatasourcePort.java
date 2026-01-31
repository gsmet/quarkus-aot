package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service354.model.Model354;
import java.util.Optional;

public interface Entity354DatasourcePort {
    Optional<Model354> find(Long id);
}

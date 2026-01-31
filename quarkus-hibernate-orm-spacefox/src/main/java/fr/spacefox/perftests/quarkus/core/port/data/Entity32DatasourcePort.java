package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service32.model.Model32;
import java.util.Optional;

public interface Entity32DatasourcePort {
    Optional<Model32> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service108.model.Model108;
import java.util.Optional;

public interface Entity108DatasourcePort {
    Optional<Model108> find(Long id);
}

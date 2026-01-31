package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service956.model.Model956;
import java.util.Optional;

public interface Entity956DatasourcePort {
    Optional<Model956> find(Long id);
}

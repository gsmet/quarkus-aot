package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service262.model.Model262;
import java.util.Optional;

public interface Entity262DatasourcePort {
    Optional<Model262> find(Long id);
}

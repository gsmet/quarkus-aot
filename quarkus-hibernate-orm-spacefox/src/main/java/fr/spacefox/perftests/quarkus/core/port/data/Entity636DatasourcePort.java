package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service636.model.Model636;
import java.util.Optional;

public interface Entity636DatasourcePort {
    Optional<Model636> find(Long id);
}

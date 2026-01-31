package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service151.model.Model151;
import java.util.Optional;

public interface Entity151DatasourcePort {
    Optional<Model151> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service444.model.Model444;
import java.util.Optional;

public interface Entity444DatasourcePort {
    Optional<Model444> find(Long id);
}

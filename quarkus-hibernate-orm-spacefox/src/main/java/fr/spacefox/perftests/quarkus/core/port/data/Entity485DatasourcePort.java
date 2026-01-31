package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service485.model.Model485;
import java.util.Optional;

public interface Entity485DatasourcePort {
    Optional<Model485> find(Long id);
}

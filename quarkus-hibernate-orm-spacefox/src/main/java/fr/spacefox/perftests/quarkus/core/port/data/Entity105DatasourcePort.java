package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service105.model.Model105;
import java.util.Optional;

public interface Entity105DatasourcePort {
    Optional<Model105> find(Long id);
}

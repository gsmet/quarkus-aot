package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service470.model.Model470;
import java.util.Optional;

public interface Entity470DatasourcePort {
    Optional<Model470> find(Long id);
}

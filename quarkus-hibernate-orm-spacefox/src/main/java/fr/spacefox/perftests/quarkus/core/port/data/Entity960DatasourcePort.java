package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service960.model.Model960;
import java.util.Optional;

public interface Entity960DatasourcePort {
    Optional<Model960> find(Long id);
}

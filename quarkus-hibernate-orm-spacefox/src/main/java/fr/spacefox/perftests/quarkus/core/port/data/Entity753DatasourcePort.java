package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service753.model.Model753;
import java.util.Optional;

public interface Entity753DatasourcePort {
    Optional<Model753> find(Long id);
}

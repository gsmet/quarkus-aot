package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service356.model.Model356;
import java.util.Optional;

public interface Entity356DatasourcePort {
    Optional<Model356> find(Long id);
}

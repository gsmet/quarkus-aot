package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service472.model.Model472;
import java.util.Optional;

public interface Entity472DatasourcePort {
    Optional<Model472> find(Long id);
}

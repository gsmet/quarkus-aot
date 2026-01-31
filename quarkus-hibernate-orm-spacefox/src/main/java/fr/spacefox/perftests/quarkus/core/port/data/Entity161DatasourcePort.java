package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service161.model.Model161;
import java.util.Optional;

public interface Entity161DatasourcePort {
    Optional<Model161> find(Long id);
}

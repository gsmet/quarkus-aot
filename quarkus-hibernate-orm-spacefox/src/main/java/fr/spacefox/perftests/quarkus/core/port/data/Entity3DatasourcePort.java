package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service3.model.Model3;
import java.util.Optional;

public interface Entity3DatasourcePort {
    Optional<Model3> find(Long id);
}

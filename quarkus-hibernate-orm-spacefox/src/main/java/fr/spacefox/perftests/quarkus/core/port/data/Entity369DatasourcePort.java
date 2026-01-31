package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service369.model.Model369;
import java.util.Optional;

public interface Entity369DatasourcePort {
    Optional<Model369> find(Long id);
}

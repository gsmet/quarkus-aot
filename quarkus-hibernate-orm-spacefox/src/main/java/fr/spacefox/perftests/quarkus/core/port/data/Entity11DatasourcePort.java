package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service11.model.Model11;
import java.util.Optional;

public interface Entity11DatasourcePort {
    Optional<Model11> find(Long id);
}

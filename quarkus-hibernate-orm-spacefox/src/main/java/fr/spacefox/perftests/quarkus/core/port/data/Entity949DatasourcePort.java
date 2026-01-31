package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service949.model.Model949;
import java.util.Optional;

public interface Entity949DatasourcePort {
    Optional<Model949> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service513.model.Model513;
import java.util.Optional;

public interface Entity513DatasourcePort {
    Optional<Model513> find(Long id);
}

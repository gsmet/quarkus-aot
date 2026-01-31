package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service520.model.Model520;
import java.util.Optional;

public interface Entity520DatasourcePort {
    Optional<Model520> find(Long id);
}

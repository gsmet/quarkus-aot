package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service367.model.Model367;
import java.util.Optional;

public interface Entity367DatasourcePort {
    Optional<Model367> find(Long id);
}

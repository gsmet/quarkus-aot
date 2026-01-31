package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service508.model.Model508;
import java.util.Optional;

public interface Entity508DatasourcePort {
    Optional<Model508> find(Long id);
}

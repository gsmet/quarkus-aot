package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service297.model.Model297;
import java.util.Optional;

public interface Entity297DatasourcePort {
    Optional<Model297> find(Long id);
}

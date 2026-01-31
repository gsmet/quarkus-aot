package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service545.model.Model545;
import java.util.Optional;

public interface Entity545DatasourcePort {
    Optional<Model545> find(Long id);
}

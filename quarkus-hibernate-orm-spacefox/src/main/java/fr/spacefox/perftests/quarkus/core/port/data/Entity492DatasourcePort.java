package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service492.model.Model492;
import java.util.Optional;

public interface Entity492DatasourcePort {
    Optional<Model492> find(Long id);
}

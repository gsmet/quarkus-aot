package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service119.model.Model119;
import java.util.Optional;

public interface Entity119DatasourcePort {
    Optional<Model119> find(Long id);
}

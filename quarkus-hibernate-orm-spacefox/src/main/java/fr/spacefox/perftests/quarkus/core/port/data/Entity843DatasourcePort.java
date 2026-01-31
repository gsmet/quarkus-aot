package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service843.model.Model843;
import java.util.Optional;

public interface Entity843DatasourcePort {
    Optional<Model843> find(Long id);
}

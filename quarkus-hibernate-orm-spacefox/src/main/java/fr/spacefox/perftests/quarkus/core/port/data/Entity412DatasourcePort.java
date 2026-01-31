package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service412.model.Model412;
import java.util.Optional;

public interface Entity412DatasourcePort {
    Optional<Model412> find(Long id);
}

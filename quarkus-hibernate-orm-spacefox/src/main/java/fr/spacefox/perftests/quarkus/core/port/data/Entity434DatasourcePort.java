package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service434.model.Model434;
import java.util.Optional;

public interface Entity434DatasourcePort {
    Optional<Model434> find(Long id);
}

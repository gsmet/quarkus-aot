package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service702.model.Model702;
import java.util.Optional;

public interface Entity702DatasourcePort {
    Optional<Model702> find(Long id);
}

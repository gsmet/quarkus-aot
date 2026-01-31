package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service746.model.Model746;
import java.util.Optional;

public interface Entity746DatasourcePort {
    Optional<Model746> find(Long id);
}

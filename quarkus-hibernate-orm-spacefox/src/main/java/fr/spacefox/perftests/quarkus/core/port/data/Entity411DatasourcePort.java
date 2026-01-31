package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service411.model.Model411;
import java.util.Optional;

public interface Entity411DatasourcePort {
    Optional<Model411> find(Long id);
}

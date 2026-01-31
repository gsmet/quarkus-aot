package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service770.model.Model770;
import java.util.Optional;

public interface Entity770DatasourcePort {
    Optional<Model770> find(Long id);
}

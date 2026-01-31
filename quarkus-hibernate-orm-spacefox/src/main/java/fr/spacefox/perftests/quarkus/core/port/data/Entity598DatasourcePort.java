package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service598.model.Model598;
import java.util.Optional;

public interface Entity598DatasourcePort {
    Optional<Model598> find(Long id);
}

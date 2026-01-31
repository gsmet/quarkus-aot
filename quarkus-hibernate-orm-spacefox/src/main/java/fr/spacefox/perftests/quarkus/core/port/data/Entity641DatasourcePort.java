package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service641.model.Model641;
import java.util.Optional;

public interface Entity641DatasourcePort {
    Optional<Model641> find(Long id);
}

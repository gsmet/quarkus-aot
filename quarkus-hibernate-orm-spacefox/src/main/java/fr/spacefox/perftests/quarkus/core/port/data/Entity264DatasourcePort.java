package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service264.model.Model264;
import java.util.Optional;

public interface Entity264DatasourcePort {
    Optional<Model264> find(Long id);
}

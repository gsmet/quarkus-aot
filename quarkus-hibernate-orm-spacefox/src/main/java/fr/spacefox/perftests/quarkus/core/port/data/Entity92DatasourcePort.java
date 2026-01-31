package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service92.model.Model92;
import java.util.Optional;

public interface Entity92DatasourcePort {
    Optional<Model92> find(Long id);
}

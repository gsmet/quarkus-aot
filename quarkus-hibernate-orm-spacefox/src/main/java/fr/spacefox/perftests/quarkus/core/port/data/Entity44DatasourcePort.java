package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service44.model.Model44;
import java.util.Optional;

public interface Entity44DatasourcePort {
    Optional<Model44> find(Long id);
}

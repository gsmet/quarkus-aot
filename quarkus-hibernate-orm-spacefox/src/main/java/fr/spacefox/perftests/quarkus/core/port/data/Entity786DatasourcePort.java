package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service786.model.Model786;
import java.util.Optional;

public interface Entity786DatasourcePort {
    Optional<Model786> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service14.model.Model14;
import java.util.Optional;

public interface Entity14DatasourcePort {
    Optional<Model14> find(Long id);
}

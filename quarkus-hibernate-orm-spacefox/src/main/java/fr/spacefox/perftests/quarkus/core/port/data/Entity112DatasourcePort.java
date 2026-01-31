package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service112.model.Model112;
import java.util.Optional;

public interface Entity112DatasourcePort {
    Optional<Model112> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service211.model.Model211;
import java.util.Optional;

public interface Entity211DatasourcePort {
    Optional<Model211> find(Long id);
}

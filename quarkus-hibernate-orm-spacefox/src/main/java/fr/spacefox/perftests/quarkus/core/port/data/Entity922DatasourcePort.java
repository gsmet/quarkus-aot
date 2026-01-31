package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service922.model.Model922;
import java.util.Optional;

public interface Entity922DatasourcePort {
    Optional<Model922> find(Long id);
}

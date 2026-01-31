package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service285.model.Model285;
import java.util.Optional;

public interface Entity285DatasourcePort {
    Optional<Model285> find(Long id);
}

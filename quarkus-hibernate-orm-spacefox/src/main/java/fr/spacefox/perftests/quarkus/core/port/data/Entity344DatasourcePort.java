package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service344.model.Model344;
import java.util.Optional;

public interface Entity344DatasourcePort {
    Optional<Model344> find(Long id);
}

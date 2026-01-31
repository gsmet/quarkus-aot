package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service100.model.Model100;
import java.util.Optional;

public interface Entity100DatasourcePort {
    Optional<Model100> find(Long id);
}

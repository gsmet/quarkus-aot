package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service17.model.Model17;
import java.util.Optional;

public interface Entity17DatasourcePort {
    Optional<Model17> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service804.model.Model804;
import java.util.Optional;

public interface Entity804DatasourcePort {
    Optional<Model804> find(Long id);
}

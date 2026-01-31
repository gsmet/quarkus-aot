package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service734.model.Model734;
import java.util.Optional;

public interface Entity734DatasourcePort {
    Optional<Model734> find(Long id);
}

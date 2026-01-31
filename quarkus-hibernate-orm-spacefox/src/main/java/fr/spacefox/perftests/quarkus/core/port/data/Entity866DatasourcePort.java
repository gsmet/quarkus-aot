package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service866.model.Model866;
import java.util.Optional;

public interface Entity866DatasourcePort {
    Optional<Model866> find(Long id);
}

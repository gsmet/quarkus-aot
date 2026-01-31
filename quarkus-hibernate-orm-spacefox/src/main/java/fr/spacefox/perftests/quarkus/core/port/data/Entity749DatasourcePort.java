package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service749.model.Model749;
import java.util.Optional;

public interface Entity749DatasourcePort {
    Optional<Model749> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service164.model.Model164;
import java.util.Optional;

public interface Entity164DatasourcePort {
    Optional<Model164> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service971.model.Model971;
import java.util.Optional;

public interface Entity971DatasourcePort {
    Optional<Model971> find(Long id);
}
